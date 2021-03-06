class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int end = s.length() - 1;
        if(end < 0) return 0;
        if(end == 0) return 1;
        int res = 0;
        while(end >=0 && s.charAt(end) !=' '){
            res++;
            end--;
        }
        return res;
    }
}