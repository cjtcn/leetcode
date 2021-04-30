class Solution {
    public int lengthOfLongestSubstring(String s) {
        // Ë«Ö¸Õë »¬¶¯´°¿Ú
        Map <Character,Integer> map = new HashMap<>();
        int res = 0; int temp = 0;
        int n = s.length();
        if(n == 0) return 0;
        int left = -1; int right = 0;
        for(int i = 0; i < n; i++){
            char c = s.charAt(i);
            if(map.containsKey(c)){
                left = Math.max(left,map.get(c));
            }
            map.put(c,i);
            res = Math.max(res,i - left);
        }
        return res;
    }
}