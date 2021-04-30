class Solution {
    public int translateNum(int num) {
       String s = "" + num;
       //String s = String.valueOf(num);
       //String s = Integer.toString(num);  三种数字转化为字符串
       int n = s.length();
       int[] dp = new int[n + 1]; // dp[i]表示以第i个字符结尾的翻译方法；
        dp[0] = 1; //无数字 若dp[2] = dp[1] + dp[0] = 2 则说明无数字时dp[0] = 1;
        dp[1] = 1; //只有一个数字
       for(int i = 2; i <= n ; i++){
            //String temp = "";
            //temp.append(s.charAt(i - 1));
            //temp.append(s.charAt(i));
            String temp = s.substring(i - 2, i); //左闭右开 
            if(temp.compareTo("25") <= 0 && temp.compareTo("10") >= 0){
               dp[i] = dp[i - 1] + dp[i - 2];
            }else{
               dp[i] = dp[i - 1];
            }
        } return dp[n];
    }
}