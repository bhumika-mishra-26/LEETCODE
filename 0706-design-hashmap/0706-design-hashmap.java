class MyHashMap {
    // brute force mai ek array bnega jo ki 10^6 size ka hoga but then that will be too much of space so we avoid it 
        



        // iss approach mai we create an array of list which has a pair inside it 
  private   List<Pair>[] bucket;
  private   int size=10000;
    static class Pair{
        int key;
        int value;
        Pair(int key,int value)
        {
            this.key=key;
            this.value=value;

        }
    }

    public MyHashMap() {
        bucket=new LinkedList[size];
        for(int i=0;i<size;i++)
        {
            bucket[i]=new LinkedList<>();

        }

        
    }
    
    public void put(int key, int value) {
        int bucketNo=key%size;
        List<Pair> chain =bucket[bucketNo];
        for(Pair p:chain)
        {
            if(p.key==key)
            {
                p.value=value;
                return ;


            }
        }
         chain.add(new Pair(key, value)); 
        
    }
    
    public int get(int key) {
        int bucketNo=key%size;
        List<Pair>chain=bucket[bucketNo];
        for(Pair p:chain)
        {
            if(p.key==key)
            return p.value;

        }
return -1;

        
    }
    
    public void remove(int key) {
        int bucketNo=key%size;
        List<Pair>chain=bucket[bucketNo];
        for(Pair p:chain)
        {
            if(p.key==key)
            {
                chain.remove(p);
                return ;
                
            }
        }
        
    }
}
// amortized o(1)

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */