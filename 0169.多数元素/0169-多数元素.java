class Solution {
    public int majorityElement(int[] nums) {
        int vote = 1;int res = nums[0];
        for(int i = 1;i < nums.length;i++){
            if(vote != 0){
                if(nums[i] == res){
                    vote++;
                }else if(nums[i] != res){
                    vote--;
                }
            }else{
                res = nums[i];
                vote++;
            }
        }return res;
    }
}