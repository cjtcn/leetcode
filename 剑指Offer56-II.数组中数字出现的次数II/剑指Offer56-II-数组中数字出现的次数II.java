class Solution {
    public int singleNumber(int[] nums) {
       int[] count = new int[32];
       int n = nums.length;
       // ����forѭ��ͳ��������Ԫ�ص�ÿ��λ���ϵ�ֵ�ĺ�
       for(int i = 0; i < n; i++){
           for(int j = 0; j < 32; j++){
               count[j] = count[j] + (nums[i] & 1);
               // �޷������� 
               nums[i] >>>= 1;
           }
       }
       int res = 0; int m = 3; 
       // �ı�m���Խ����ͬ�ظ����ֵ����ֵĴ������� 
       for(int k = 0; k < 32;k++){
           res <<= 1;
           // �� ����0 ����0
           // resλ��0 count��1 ��resλ���1 count��0 ��resλ���0
           // �൱�ڸ�λrescount�����ֵ
           res |= count[31 - k] % m; 
           
       }
       return res;
    }
}