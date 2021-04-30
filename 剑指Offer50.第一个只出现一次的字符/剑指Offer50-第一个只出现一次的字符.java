class Solution {
    public char firstUniqChar(String s) {
        if(s.length() == 0) return ' ';
        Map<Character, Boolean> map = new HashMap<>();
        char[] c = s.toCharArray();
        int n = c.length;
        for(int i = 0; i < n; i++){
            if(!map.containsKey(c[i])){
                map.put(c[i],true);
            }else{
                map.put(c[i],false);
            }
        }
        for(int j = 0; j < n; j++){
            if(map.get(c[j])){
                return c[j];
            }
        }
        return ' ';
    }
}