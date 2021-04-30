class Solution {
    public String largestNumber(int[] nums) {
       quickSort(nums,0,nums.length - 1);
       if(nums[0] == 0) return "0";

       StringBuilder  res = new StringBuilder();
       for(int i = 0;i < nums.length;i++){
           res.append(nums[i]);
       } 
       return res.toString(); 
    }

    private void quickSort(int[] nums, int start,int end){
        if(start >= end) return;
        int pivot = nums[start];
        int index = start;
        for(int i = start + 1; i <= end;i++){
            long x = 10;
            long y = 10;
            while(nums[i] >= x){
                x = x * 10;
            }while(pivot >= y){
                y = y * 10;
            }
            if(nums[i] * y + pivot > pivot * x + nums[i]){
                index++;
                swap(nums,index,i);
            }
        }
        swap(nums,index,start);
        quickSort(nums,start,index - 1);
        quickSort(nums,index + 1,end);
        
    }

    private void swap(int[] nums,int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}