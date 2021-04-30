class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n == 0) return 0;
        if(n == 1) return nums[0];
        if(n == 2) return Math.max(nums[0],nums[1]);
        int a = robWithoutOne(nums,1,n - 1);
        int b = robWithoutOne(nums,0,n - 2);
        return Math.max(a,b);


    }


    public int robWithoutOne(int[] nums,int i, int j){
        int n = nums.length;
        int[][] dp = new int[n][2];
        dp[i][0] = 0; // 第一个不偷
        dp[i][1] = nums[i]; // 第一个偷
        for(int k = i + 1;k <= j;k++){
            dp[k][0] = Math.max(dp[k - 1][0],dp[k - 1][1]);
            dp[k][1] = dp[k - 1][0] + nums[k];
        }
        return Math.max(dp[j][0],dp[j][1]);
    }
}