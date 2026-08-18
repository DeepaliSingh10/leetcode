class Solution {
    public boolean rotateString(String s, String goal) {

        int n = s.length();

        if (n != goal.length()) {
            return false;
        }

        for (int i = 0; i < n; i++) {

            if (goal.charAt(i) != s.charAt(0)) {
                continue;
            }

            StringBuilder ans = new StringBuilder();

            for (int j = i; j < n; j++) {
                ans.append(goal.charAt(j));
            }

            for (int j = 0; j < i; j++) {
                ans.append(goal.charAt(j));
            }

            if (ans.toString().equals(s)) {
                return true;
            }
        }

        return false;
    }
}