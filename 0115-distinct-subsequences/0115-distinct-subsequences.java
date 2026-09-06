class Solution {
    public int numDistinct(String s, String t) {

        int m = s.length();
        int n = t.length();

        int[][] dp = new int[m + 1][n + 1];

        // Empty t can be formed from any s in exactly 1 way
        for (int i = 0; i <= m; i++) {
            dp[i][0] = 1;
        }

        // Fill the DP table
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {

                if (s.charAt(i - 1) == t.charAt(j - 1)) {

                    // Two choices:
                    // 1. Use this character
                    // 2. Don't use this character
                    dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];

                } else {

                    // Cannot use s[i-1]
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        return dp[m][n];
    }
}