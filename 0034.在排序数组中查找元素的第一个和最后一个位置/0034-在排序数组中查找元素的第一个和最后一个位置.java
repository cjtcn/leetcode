class Solution {
    public int[] searchRange(int[] nums, int target) {
        int l = searchTarget(nums,target - 1);
        int r = searchTarget(nums,target);
        if(l == r) return new int[] {-1,-1};
        return new int[] {l + 1, r};
    }
    public static int searchTarget(int[] nums, int target){
        int l = 0; int r = nums.length - 1;
        while(l <= r){
            int m = l + (r - l) / 2;
            if(nums[m] <= target){
                l = m + 1;
            }else if(nums[m] > target){
                r = m - 1;
            }
        }return r;
    }

}