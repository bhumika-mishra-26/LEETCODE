class MyHashSet {
/// isme brute force mai ek array just take it of size 10^6  and mark it as false initially 
//but then again that willl be tooo much of space 


//  collision ko avoid karne ke 2 approaches r there 
// 1. separate chaining 
// 2.open addressing 
private int bucketSize;

 private List<LinkedList<Integer>> buckets;



    public MyHashSet() {
        bucketSize=10000;
        buckets=new ArrayList<>();
        // buckets create karo 
           for (int i = 0; i < bucketSize; i++) {
            buckets.add(new LinkedList<>());
        }
        
    }
    
    public void add(int key) {
      int k = key % bucketSize;
      
    if (!buckets.get(k).contains(key)) {
        buckets.get(k).add(key);
        
    }
    }
    
    public void remove(int key) {
        
              int k = key % bucketSize;

        buckets.get(k).remove(Integer.valueOf(key));
    }
    
    public boolean contains(int key) {
          int k = key % bucketSize;

        return buckets.get(k).contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */