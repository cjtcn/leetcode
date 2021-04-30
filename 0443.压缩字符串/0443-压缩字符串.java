class Solution {
    public int compress(char[] chars) {
        //whiteд��ָ��  ��firstΪ��ͬԪ�صĵ�һ��λ��
        int white = 0; int first = 0;
        for(int read = 0; read < chars.length;read++){
            // ���û����һ���ַ� ���ߵ�ǰ�ַ���������һ���ַ�
            if(read + 1 == chars.length || chars[read] != chars[read + 1]){
                //д���ַ�
                chars[white] = chars[first];
                white++;
                //д������
                if(read > first){
                    //��"" + ���֣�����ַ��� �ٱ���ַ����� ��д��chars������  
                    for(char c : ("" + (read - first + 1)).toCharArray()){
                        chars[white] = c;
                        white++;
                    }
                }//��������
                first = read + 1;
            }
        }return white;
    }
}