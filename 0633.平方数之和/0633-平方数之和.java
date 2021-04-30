class Solution {
    public boolean judgeSquareSum(int c) {
        // 双指针 重点是右指针要取 sqrt(c)这个起点
        long left = 0; long right = (long)Math.sqrt(c);
        while(left <= right){
            if(left * left + right * right == c){
                return true;
            }else if(left * left + right * right <= c){
                left++;
            }else{
                right--;
            }
        }
        return false;
        
        
    }
}