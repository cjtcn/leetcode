class Solution {
    public String reverseLeftWords(String s, int n) {
        char[] c = s.toCharArray();
        StringBuffer res = new StringBuffer();
        for(int i = 0; i < c.length; i++){
            int j = (i + n) % c.length;
            res.append(c[j]);
        }
       
        
        return res.toString();

    }
}