class Solution {
    public int compress(char[] chars) {
        //white写入指针  ；first为相同元素的第一个位置
        int white = 0; int first = 0;
        for(int read = 0; read < chars.length;read++){
            // 如果没有下一个字符 或者当前字符不等于下一个字符
            if(read + 1 == chars.length || chars[read] != chars[read + 1]){
                //写入字符
                chars[white] = chars[first];
                white++;
                //写入数字
                if(read > first){
                    //（"" + 数字）变成字符串 再变成字符数组 再写入chars数组中  
                    for(char c : ("" + (read - first + 1)).toCharArray()){
                        chars[white] = c;
                        white++;
                    }
                }//继续遍历
                first = read + 1;
            }
        }return white;
    }
}