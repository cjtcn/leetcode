class Solution {
    public int findMin(int[] nums) {
        if(nums.length == 1) return nums[0];
        int i = 0; int j = nums.length - 1;
        
        while(i < j){
            int num = nums[j];
            int m = i + (j - i) / 2;
            if(nums[m] < num){
               j = m;
            }else{
               i = m + 1;
           }
        }return nums[j];  
    }
}