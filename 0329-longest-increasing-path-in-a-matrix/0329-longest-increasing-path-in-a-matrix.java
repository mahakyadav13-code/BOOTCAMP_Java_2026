class Solution {
    public int longestIncreasingPath(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        // dp[i][j] stores the longest increasing path starting from (i, j)
        int[][] dp = new int[m][n];

        int maxPath = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                maxPath = Math.max(maxPath, dfs(matrix, i, j, dp));
            }
        }

        return maxPath;
    }

    private int dfs(int[][] matrix, int row, int col, int[][] dp) {

        // If already calculated, return stored result
        if (dp[row][col] != 0) {
            return dp[row][col];
        }

        int m = matrix.length;
        int n = matrix[0].length;

        int max = 1; // Path containing only the current cell

        // Four directions: up, down, left, right
        int[][] directions = {
            {-1, 0},
            {1, 0},
            {0, -1},
            {0, 1}
        };

        for (int[] dir : directions) {
            int newRow = row + dir[0];
            int newCol = col + dir[1];

            // Check boundaries and increasing condition
            if (newRow >= 0 && newRow < m &&
                newCol >= 0 && newCol < n &&
                matrix[newRow][newCol] > matrix[row][col]) {

                max = Math.max(
                    max,
                    1 + dfs(matrix, newRow, newCol, dp)
                );
            }
        }

        dp[row][col] = max;
        return max;
    }
}