class MedianFinder {
    Queue<Integer> A,B;
    /** initialize your data structure here. */
    public MedianFinder() {
        A = new PriorityQueue<>(); //A��һ��С���� ������ǽϴ��һ�� A������Զ���ڵ���B
        B = new PriorityQueue<>((x,y) -> (y - x)); // B��һ������ѣ�������ǽ�С��һ��
    }
    
    public void addNum(int num) {

        if(A.size() != B.size()){ // ���A B��������ͬ ��Ҫ��B����Ԫ�� ������ֱ�Ӳ�
            A.add(num);
            B.add(A.poll());
        }else{ // ���AB������� ��Ҫ��A����һ��Ԫ�� Ҳ����ֱ�Ӳ�
            B.add(num);
            A.add(B.poll()); //poll�ǳ���
        }
    }
    
    public double findMedian() {
       return A.size() == B.size() ? (A.peek() + B.peek()) / 2.0  : A.peek(); //peak��֪��ֵ��������
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */