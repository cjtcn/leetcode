class Solution {
    public int cuttingRope(int n) {
        if(n <= 3) return n - 1;
        // 绳子每段是3的时候应该是乘积最大的
        int a = n / 3; int b = n % 3;
        if(b == 0) return (int)Math.pow(3,a);
        if(b == 1) return (int)Math.pow(3,a - 1) * 4;
        return (int)Math.pow(3,a) * 2;
    }
}