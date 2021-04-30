class Solution {
    public int lastRemaining(int n, int m) {
        return f(n,m);
    }
    public int f(int n, int m){
        if(n == 1){
            return 0;
        }else{
          return (m % n + f(n - 1, m)) % n; 
        }
        
    }
}