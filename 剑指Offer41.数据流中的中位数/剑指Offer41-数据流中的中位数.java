class MedianFinder {
    Queue<Integer> A,B;
    /** initialize your data structure here. */
    public MedianFinder() {
        A = new PriorityQueue<>(); //A是一个小根堆 保存的是较大的一半 A数量永远大于等于B
        B = new PriorityQueue<>((x,y) -> (y - x)); // B是一个大根堆，保存的是较小的一半
    }
    
    public void addNum(int num) {

        if(A.size() != B.size()){ // 如果A B个数不相同 需要向B插入元素 但不能直接插
            A.add(num);
            B.add(A.poll());
        }else{ // 如果AB个数相等 需要向A插入一个元素 也不能直接插
            B.add(num);
            A.add(B.poll()); //poll是出堆
        }
    }
    
    public double findMedian() {
       return A.size() == B.size() ? (A.peek() + B.peek()) / 2.0  : A.peek(); //peak是知道值但不出堆
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */