class Solution {
    public String longestPalindrome(String s) {
        
         int n = s.length();
         if(n == 0) return " ";
         if(n == 1) return s;
        int lentemp = 1;
        int maxlen = 1;
        int maxstart = 0;
        int maxend = 0;
        
        for(int i = 0; i < n;i++){
            int left = i - 1;
            int right = i + 1;
            while(left >= 0 && s.charAt(left) == s.charAt(i)){
                lentemp++;
                left--;
            }while(right < n && s.charAt(right) == s.charAt(i)){
                lentemp++;
                right++;
            }while(left >= 0 && right < n && s.charAt(left) == s.charAt(right)){
                lentemp = lentemp + 2;
                right++;
                left--;
            }if(maxlen < lentemp){
                maxlen = lentemp;
                maxstart = left + 1;
                maxend = right - 1;
            }
            lentemp = 1;
            
        }
        return s.substring(maxstart,maxend + 1); //substirng×ó±ÕÓÒ¿ª
    }
}