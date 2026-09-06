class Solution {
    public int numDistinct(String s, String t) {

        int m = s.length();
        int n = t.length();

        long[] dp = new long[n + 1];

        // Empty t can be formed in exactly 1 way
        dp[0] = 1;

        for (int i = 0; i < m; i++) {

            for (int j = n; j >= 1; j--) {

                if (s.charAt(i) == t.charAt(j - 1)) {
                    dp[j] = dp[j] + dp[j - 1];
                }
            }
        }

        return (int) dp[n];
    }
}