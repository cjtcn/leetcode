class Solution {
    public int maxValue(int[][] grid) {
        int row = grid.length;
        int column = grid[0].length;
        // dp[i][j]表示从grid[0][0]到grid[i][j]能拿到的礼物价值
        int[][] dp = new int[row][column];
        dp[0][0] = grid[0][0];
        for(int i = 0; i < row; i++){
            for(int j = 0;j < column; j++){
                if(i == 0 && j == 0) continue;
                if(i == 0) dp[i][j] = dp[i][j - 1] + grid[i][j];
                if(j == 0) dp[i][j] = dp[i - 1][j] + grid[i][j];
                if(i != 0 && j != 0) dp[i][j] = Math.max(dp[i][j - 1],dp[i - 1][j]) + grid[i][j];
            }
        }
        return dp[row - 1][column - 1];
    }
}