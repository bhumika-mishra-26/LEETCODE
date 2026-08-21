// isme dikkat ye nhi thi normal approach mae apan jab erase kar rhe thae to vo jo push tha uske baad saare elements  ek sapce pehle aa jaate thae to that was a bit costly so we need to reduce that 
// import java.util.HashMap;
// import java.util.Map;

// class ListNode {
//     int key;
//     int value;
//     ListNode prev;
//     ListNode next;

//     ListNode(int key, int value) {
//         this.key = key;
//         this.value = value;
//     }
// }

// class DLinkedList {
//     private ListNode head;
//     private ListNode tail;

//     DLinkedList() {
//         head = new ListNode(-1, -1);
//         tail = new ListNode(-1, -1);

//         head.next = tail;
//         tail.prev = head;
//     }

//     public void addFirst(ListNode node) {
//         ListNode first = head.next;

//         node.next = first;
//         node.prev = head;

//         head.next = node;
//         first.prev = node;
//     }

//     public void remove(ListNode node) {
//         ListNode prevNode = node.prev;
//         ListNode nextNode = node.next;

//         prevNode.next = nextNode;
//         nextNode.prev = prevNode;

//         node.prev = null;
//         node.next = null;
//     }

//     public ListNode removeLast() {
//         ListNode last = tail.prev;

//         if (last == head) {
//             return null;
//         }

//         remove(last);
//         return last;
//     }
// }

// class LRUCache {
//     private int capacity;
//     private Map<Integer, ListNode> cache;
//     private DLinkedList cacheQueue;

//     public LRUCache(int capacity) {
//         this.capacity = capacity;
//         this.cache = new HashMap<>();
//         this.cacheQueue = new DLinkedList();
//     }

//     public int get(int key) {
//         if (!cache.containsKey(key)) {
//             return -1;
//         }

//         ListNode node = cache.get(key);

//         cacheQueue.remove(node);
//         cacheQueue.addFirst(node);

//         return node.value;
//     }

//     public void put(int key, int value) {
//         if (cache.containsKey(key)) {
//             ListNode node = cache.get(key);

//             node.value = value;

//             cacheQueue.remove(node);
//             cacheQueue.addFirst(node);

//             return;
//         }

//         if (cache.size() >= capacity) {
//             ListNode removedNode = cacheQueue.removeLast();
//             cache.remove(removedNode.key);
//         }

//         ListNode newNode = new ListNode(key, value);
//         cacheQueue.addFirst(newNode);
//         cache.put(key, newNode);
//     }
// }






// isme we need to get the element in 0(1) time so hasmap does that but it does not preserve the insetion order so we use the doubly linked list

class ListNode{
    int key;
    int value;
    ListNode prev;
    ListNode next;
    ListNode(int key,int value)
    {
        this.key=key;
        this.value=value;

    }

}
class DoublyLinkedList{
ListNode head;
ListNode tail;
DoublyLinkedList()
{
     head=new ListNode(-1,-1);
     tail=new ListNode (-1,-1);
    head.next=tail;
    tail.prev=head;

}
public void addFirst(ListNode node)
{
   
    ListNode sec=head.next;
    node.prev=head;
    node.next=sec;
    head.next=node;
    sec.prev=node;


}
public void remove(ListNode node)
{
    ListNode prevNode =node.prev;
    ListNode nextNode=node.next;
    node.prev=null;
    node.next=null;
    prevNode.next=nextNode;
    nextNode.prev=prevNode;

}

public ListNode  removeLast(  )
{
    ListNode sec=tail.prev;
    if(sec==head)
    return null;
    remove(sec);
    return sec;
}

}


class LRUCache {
    int capacity;
    Map<Integer,ListNode>cache;
    DoublyLinkedList cachedQueue;



    public LRUCache(int capacity) {
        this.capacity=capacity;
        this.cache=new HashMap<>();
        this.cachedQueue=new DoublyLinkedList();


        
    }
    
    public int get(int key) {
        if(!cache.containsKey(key))
        {
            return -1;

        }
        ListNode getting=cache.get(key);
    cachedQueue.remove(getting);
    cachedQueue.addFirst(getting);
    return getting.value;


    }
    
    public void put(int key, int value) {
        if(cache.containsKey(key))
        {
ListNode new_node=cache.get(key);
new_node.value=value;
cachedQueue.remove(new_node);
cachedQueue.addFirst(new_node);
return ;


        }
        if(cache.size()>=capacity)
        {
            ListNode sec=cachedQueue.removeLast();
            cache.remove(sec.key);


        }
        ListNode newNode = new ListNode(key, value);
              cachedQueue.addFirst(newNode);
              cache.put(key, newNode);
  

    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */