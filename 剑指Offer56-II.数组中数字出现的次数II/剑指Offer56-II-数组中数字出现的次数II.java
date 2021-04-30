class Solution {
    public int singleNumber(int[] nums) {
       int[] count = new int[32];
       int n = nums.length;
       // 两个for循环统计数组中元素的每个位数上的值的和
       for(int i = 0; i < n; i++){
           for(int j = 0; j < 32; j++){
               count[j] = count[j] + (nums[i] & 1);
               // 无符号右移 
               nums[i] >>>= 1;
           }
       }
       int res = 0; int m = 3; 
       // 改变m可以解决不同重复出现的数字的次数的题 
       for(int k = 0; k < 32;k++){
           res <<= 1;
           // 或 都是0 才是0
           // res位是0 count是1 则res位变成1 count是0 则res位变成0
           // 相当于赋位rescount数组的值
           res |= count[31 - k] % m; 
           
       }
       return res;
    }
}