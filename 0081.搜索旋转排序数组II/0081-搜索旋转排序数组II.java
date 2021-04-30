class Solution {
    public boolean search(int[] nums, int target) {
        int l = 0; int r = nums.length - 1;
        int n = nums.length;
        if(n == 0) return false;
        if(n == 1) return nums[0] == target ? true : false;
        while(l <= r){
            int m = l + (r - l) / 2;
            if(nums[m] == target){
                return true;
            }if(nums[m] == nums[l]){
                l++;
                continue;
                
            }if(nums[l] < nums[m]){
                if(nums[l] <= target && target < nums[m]){
                    r = m - 1;
                }else{
                    l = m + 1;
                }
                
            }else{
                if(nums[m] < target && target <= nums[r]){
                    l = m + 1;
                }else{
                    r = m - 1;
                }
            }
        }return false;
    }
}