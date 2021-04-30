class Solution {
     
    public static int maxLengthBetweenEqualCharacters(String s) {
        char[] c = s.toCharArray();

        int[] alphabet = new int[26]; //我认为是一种类哈希表的思想

        Arrays.fill(alphabet, -1);
        int res = -1;

        for (int i = 0; i < c.length; i++) {
            if (alphabet[c[i] - 'a'] == -1) { //如果之前遍历没有出现过
                alphabet[c[i] - 'a'] = i;
            } else {
                res = Math.max(res, i - alphabet[c[i] - 'a'] - 1);
            }
        }
        return res;

    }
}