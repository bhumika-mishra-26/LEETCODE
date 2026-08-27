class SmallestInfiniteSet {
    private PriorityQueue<Integer>pq;
    private HashSet<Integer>st;
    int current;


    public SmallestInfiniteSet() {
      pq  =new PriorityQueue<>();
      st=new HashSet<>();
      current=1;


          }
    
    public int popSmallest() {
        if(!pq.isEmpty())
        {
            int small=pq.poll();
            st.remove(small);
            return small;
        }
        return current++;



        
    }
    
    public void addBack(int num) {
        if(num<current && !st.contains(num))
        {
            pq.offer(num);

            st.add(num);

        }
        
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */