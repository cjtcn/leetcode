class Solution {
    public int translateNum(int num) {
       String s = "" + num;
       //String s = String.valueOf(num);
       //String s = Integer.toString(num);  ��������ת��Ϊ�ַ���
       int n = s.length();
       int[] dp = new int[n + 1]; // dp[i]��ʾ�Ե�i���ַ���β�ķ��뷽����
        dp[0] = 1; //������ ��dp[2] = dp[1] + dp[0] = 2 ��˵��������ʱdp[0] = 1;
        dp[1] = 1; //ֻ��һ������
       for(int i = 2; i <= n ; i++){
            //String temp = "";
            //temp.append(s.charAt(i - 1));
            //temp.append(s.charAt(i));
            String temp = s.substring(i - 2, i); //����ҿ� 
            if(temp.compareTo("25") <= 0 && temp.compareTo("10") >= 0){
               dp[i] = dp[i - 1] + dp[i - 2];
            }else{
               dp[i] = dp[i - 1];
            }
        } return dp[n];
    }
}