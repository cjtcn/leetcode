class Solution {
    public int nthUglyNumber(int n) {
        int a2 = 1; int a3 = 1; int a5 = 1;
        int[] dp = new int[n + 1];
        dp[1] = 1;
        for(int i = 2; i <= n; i++){
            dp[i] = Math.min(dp[a2] * 2,Math.min(dp[a3] * 3,dp[a5] * 5));
            if(dp[i] == dp[a2] * 2) a2++;
            if(dp[i] == dp[a3] * 3) a3++;
            if(dp[i] == dp[a5] * 5) a5++;
        }
        return dp[n];
    }
}