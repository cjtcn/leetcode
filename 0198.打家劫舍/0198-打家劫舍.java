class Solution {
    public int rob(int[] nums) {
        int l = nums.length;
        if(l == 1) return nums[0];
        int first = nums[0];
        int second = Math.max(nums[0],nums[1]);
        for(int i = 2; i < l; i++){
            int temp = second;
            second = Math.max(first + nums[i],second);
            first = temp;
        }
        return second;
    }
}