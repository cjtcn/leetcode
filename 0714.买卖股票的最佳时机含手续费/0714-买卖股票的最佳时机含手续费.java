class Solution {
    public int maxProfit(int[] prices, int fee) {
        int n = prices.length;
        //int[][] dp = new int[n][2];
        //dp[0][0] = 0;
        //dp[0][1] = -prices[0] - fee;
        int profit0 = 0;
        int profit1 = -prices[0] - fee;
        for(int i = 1; i < n;i++){
            //dp[i][0] = Math.max(dp[i - 1][0],dp[i - 1][1] + prices[i]);
            //dp[i][1] = Math.max(dp[i - 1][1],dp[i - 1][0] -prices[i] - fee);
            int temp0 = Math.max(profit0,profit1 + prices[i]);
            int temp1= Math.max(profit1,profit0 - prices[i] - fee);
            profit0 = temp0;
            profit1 = temp1;
        }
        return profit0;
    }
}