class MyStack {
    // isme what we do is humlog ek queue lenge and we just push it in queue and because it gets added at the rearr end we will pop remaining ellemnts from the queue and push them to the last 

    Queue<Integer>pq=new LinkedList<>();


    public MyStack() {
        
    }
    
    public void push(int x) {
        pq.offer(x);
        // now pop size-1 elememts from this queue and push them to the last 
        for(int i=0;i<pq.size()-1;i++)
        {
            int l=pq.poll();
            pq.offer(l);

        }

        
    }
    
    public int pop() {
      int q=pq.poll();
      return q;


        
    }
    
    public int top() {
        return pq.peek();

        
    }
    
    public boolean empty() {
        if(pq.size()==0)
        return true;
        else return false;

        
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */