class Solution {
    public String minNumber(int[] nums) {
        //��������
        String[] str = new String[nums.length];
        for(int i = 0; i < nums.length; i++){
            str[i] = "" + nums[i];
        }
        quickSort(str,0,nums.length - 1);
        StringBuilder res = new StringBuilder();
        for(String s : str){
            res.append(s);
        }
        return res.toString();

    }

    public void quickSort(String[] str, int l, int r){
        if(l >= r) return;
        int i = l; int j = r;
        
        while(i < j){
            while(i < j && (str[j] + str[l]).compareTo(str[l] + str[j]) >= 0) j--; //�Ӻ��ѡ��lС��
            while(i < j && (str[i] + str[l]).compareTo(str[l] + str[i]) <= 0) i++;//��ǰ��ѡ��l���
            swap(str,i,j);
        }
        swap(str,l,i);
        quickSort(str,l,i - 1);
        quickSort(str,i + 1,r);
    }
    public void swap(String[] str, int i, int j){
        String temp = str[i];
        str[i] = str[j];
        str[j] = temp;
    }
}