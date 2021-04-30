class Solution {
    public int search(int[] nums, int target) {
        return helper(nums,target) - helper(nums, target - 1); // target���ұ߽� - target - 1���ұ߽�


    }

    public int helper(int[] nums, int target){ //�ҵ�target���ұ߽�
        int i = 0; int j = nums.length - 1;
        while(i <= j){
            int m = i + (j - i) / 2;
            if(nums[m] <= target){
                i = m + 1;
            }else{
                j = m - 1;
            }
        }return i;
    }
}