class Solution {
    public int search(int[] arr, int target) {
        int n = arr.length - 1;
        for(int i = 0; i <= n;i++){
            if(arr[i] == target){
                return i;
            }
        }return -1;
    }    
}