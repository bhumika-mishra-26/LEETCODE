class MedianFinder {
    // isme we create two heaps one will be max heap the other will be a min heap
    // agar jo elemnt aa rha jo max heap ke top se chota h to it will be added in maxheap aur agar jo elemt aa rha h vo bada h to it will be added in min heap
       //hamesha min heap ka size kam hoga rather than max heap 

   PriorityQueue<Integer>max_heap=new PriorityQueue<>((a,b)->b-a);
         PriorityQueue<Integer>min_heap=new PriorityQueue<>((a,b)->a-b);


    public MedianFinder() {
     

        
    }
    
    public void addNum(int num) {
        if(max_heap.isEmpty()|| num < max_heap.peek())
        {
            max_heap.offer(num);

        }
        else{
            min_heap.offer(num);

        }
        if(max_heap.size()-min_heap.size()>1)
        {
           int p= max_heap.poll();
           min_heap.offer(p);


        }
        else if(min_heap.size()>max_heap.size())
        {
            int q=min_heap.poll();
            max_heap.offer(q);

        }
        
    }
    
    public double findMedian() {
        
        if(min_heap.size()==max_heap.size())
        return (min_heap.peek()+max_heap.peek())/2.0;
         else
         return max_heap.peek();

        
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */