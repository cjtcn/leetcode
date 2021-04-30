class Solution {
    public int lengthOfLongestSubstring(String s) {
      Set<Character> set = new HashSet<>();
      int rk = -1; int res = 0;
      for(int i = 0;i < s.length();i++){
          if(i != 0){
              set.remove(s.charAt(i - 1));
          }while(rk + 1 < s.length() && !set.contains(s.charAt(rk + 1))){
              set.add(s.charAt(rk + 1));
              
              rk++;
          }
          res = Math.max(res,rk - i + 1);
      }  return res;
    }
}