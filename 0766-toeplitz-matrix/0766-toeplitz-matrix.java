class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            int j=0;
            int num=matrix[i][j];
            int k=i;
            while(j<matrix[0].length && k<matrix.length){
                    if(num!=matrix[k++][j++])
                    {
                        return false;
                    }
                    
            }}
            for(int i=0;i<matrix[0].length;i++){
            int j=0;
            int num=matrix[j][i];
            int k=i;
            while(k<matrix[0].length && j<matrix.length){
                    if(num!=matrix[j++][k++])
                    {
                        return false;
                    }
                    
            }
        }
        return true;

    }
}