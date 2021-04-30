class Solution {
    public int findRepeatNumber(int[] nums) {
      Set<Integer> set = new HashSet<Integer>();
      int repeat = -1;
      for(int i = 0; i < nums.length;i++){
          if(!set.add(nums[i])){
              repeat = nums[i];
              break;
          }
      }
      return repeat;
    }
}