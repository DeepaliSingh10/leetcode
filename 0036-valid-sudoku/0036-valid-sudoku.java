class Solution {
    public boolean isValidSudoku(char[][] board) {

        // Check rows
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {

                if (board[i][j] == '.') continue;

                for (int k = j + 1; k < 9; k++) {
                    if (board[i][j] == board[i][k]) {
                        return false;
                    }
                }
            }
        }

        // Check columns
        for (int j = 0; j < 9; j++) {
            for (int i = 0; i < 9; i++) {

                if (board[i][j] == '.') continue;

                for (int k = i + 1; k < 9; k++) {
                    if (board[i][j] == board[k][j]) {
                        return false;
                    }
                }
            }
        }

        // Check each 3x3 box
        for (int row = 0; row < 9; row += 3) {
            for (int col = 0; col < 9; col += 3) {

                for (int i = row; i < row + 3; i++) {
                    for (int j = col; j < col + 3; j++) {

                        if (board[i][j] == '.') continue;

                        for (int x = i; x < row + 3; x++) {
                            int start = (x == i) ? j + 1 : col;

                            for (int y = start; y < col + 3; y++) {
                                if (board[i][j] == board[x][y]) {
                                    return false;
                                }
                            }
                        }
                    }
                }
            }
        }

        return true;
    }
}