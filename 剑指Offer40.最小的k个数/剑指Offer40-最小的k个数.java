class Solution {
    public int[] getLeastNumbers(int[] arr, int k) {
        // 堆排序

        Queue<Integer> a = new PriorityQueue<>((x,y) -> (y - x)); //建立一个大根堆
        for(int i = 0; i < arr.length; i++){
            if(a.size() < k){
                a.offer(arr[i]);
            }else if(a.size() >= k){
                a.offer(arr[i]);
                a.poll();
            }
        }
        int[] res = new int[k];
        for(int j = 0; j < k; j++){
            res[j] = a.poll();
        }
        return res;
        
            

    }  
}