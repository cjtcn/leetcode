class Solution {
    public int[] singleNumbers(int[] nums) {
        //分组异或 相同为0 不同为1
        int n = nums.length;
        int m = nums[0];
        for(int i = 1; i < n; i++){
            m = m ^ nums[i];
        }
        int mask = 1;
        while((mask & m) == 0){
            mask <<= 1;
        }
        int a = 0;
        int b = 0;
        for(int i = 0; i < n; i++){
            if((nums[i] & mask) == 0){
                a = a ^ nums[i];
            }else if((nums[i] & mask) != 0){
                b = b ^ nums[i];
            }
        }
        return new int[] {a,b};

    }
}