class Solution {
    public String replaceSpace(String s) {
        int length = s.length();
        char[] array = new char[length * 3];
        int size = 0;
        for(int i = 0; i < length; i++){
            char c = s.charAt(i);
            if(c == ' '){
                array[size++] = '%';
                array[size++] = '2';
                array[size++] = '0';
            }else{
                array[size++] = c;
            }
        }
        StringBuilder newstr = new StringBuilder();
        for(int i = 0;i < size;i++){
            newstr.append(array[i]);
        }
        return newstr.toString();

    }
}