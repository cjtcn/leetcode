class Solution {
    public int sumNums(int n) {
        boolean flag;
        int res = 0; int a = n; int b = n + 1;

        flag = ((b & 1) == 1) && (res += a) > 0;
        a <<= 1;
        b >>= 1;

        flag = ((b & 1) == 1) && (res += a) > 0;
        a <<= 1;
        b >>= 1;

        flag = ((b & 1) == 1) && (res += a) > 0;
        a <<= 1;
        b >>= 1;

        flag = ((b & 1) == 1) && (res += a) > 0;
        a <<= 1;
        b >>= 1;

        flag = ((b & 1) == 1) && (res += a) > 0;
        a <<= 1;
        b >>= 1;

         flag = ((b & 1) == 1) && (res += a) > 0;
        a <<= 1;
        b >>= 1;

         flag = ((b & 1) == 1) && (res += a) > 0;
        a <<= 1;
        b >>= 1;

         flag = ((b & 1) == 1) && (res += a) > 0;
        a <<= 1;
        b >>= 1;

        flag = ((b & 1) == 1) && (res += a) > 0;
        a <<= 1;
        b >>= 1;

        flag = ((b & 1) == 1) && (res += a) > 0;
        a <<= 1;
        b >>= 1;

         flag = ((b & 1) == 1) && (res += a) > 0;
        a <<= 1;
        b >>= 1;

        flag = ((b & 1) == 1) && (res += a) > 0;
        a <<= 1;
        b >>= 1;

        flag = ((b & 1) == 1) && (res += a) > 0;
        a <<= 1;
        b >>= 1;

        flag = ((b & 1) == 1) && (res += a) > 0;
        a <<= 1;
        b >>= 1;

        flag = ((b & 1) == 1) && (res += a) > 0;
        a <<= 1;
        b >>= 1;

        flag = ((b & 1) == 1) && (res += a) > 0;
        a <<= 1;
        b >>= 1;

        flag = ((b & 1) == 1) && (res += a) > 0;
        a <<= 1;
        b >>= 1;

        flag = ((b & 1) == 1) && (res += a) > 0;
        a <<= 1;
        b >>= 1;

        return res >> 1;
    } 
}