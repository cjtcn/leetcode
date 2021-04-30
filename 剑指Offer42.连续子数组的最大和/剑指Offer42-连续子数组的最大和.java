class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        //int[] dp = new int[n]; // dp[i]表示 包含数组num[i]的连续子数组最大和
        int res = nums[0];
        int curr = res;
        //dp[0] = Math.max(0,nums[0]);
        for(int i = 1; i < n; i++){
           //dp[i] = Math.max(0,dp[i - 1]) + nums[i];
           curr = Math.max(0,curr) + nums[i]; 
           //res = Math.max(res,dp[i]);
           res = Math.max(res,curr); 
        }
        return res;
    }
}