class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> hashmap = new HashMap<>();
        for(int i = 0; i < nums.length;i++){
            
            if(hashmap.get(target - nums[i]) != null){
                int j = hashmap.get(target - nums[i]);
                return new int[]{i,j};
            }else{
                hashmap.put(nums[i],i);
            }
        }return null;

    }
}