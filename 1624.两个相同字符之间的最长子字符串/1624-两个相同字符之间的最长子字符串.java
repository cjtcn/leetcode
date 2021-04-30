class Solution {
     
    public static int maxLengthBetweenEqualCharacters(String s) {
        char[] c = s.toCharArray();

        int[] alphabet = new int[26]; //����Ϊ��һ�����ϣ���˼��

        Arrays.fill(alphabet, -1);
        int res = -1;

        for (int i = 0; i < c.length; i++) {
            if (alphabet[c[i] - 'a'] == -1) { //���֮ǰ����û�г��ֹ�
                alphabet[c[i] - 'a'] = i;
            } else {
                res = Math.max(res, i - alphabet[c[i] - 'a'] - 1);
            }
        }
        return res;

    }
}