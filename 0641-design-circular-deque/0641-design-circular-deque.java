class MyCircularDeque {

    // see isme u can have insertion and deletion at both the ends 

    // jab peechae jaana ho for circular queue condition is front/rear-1+k% size 
    // and aage wali condition u already know 
    int [] arr;
    int len;
    int front;
    int k;
    int rear;


    public MyCircularDeque(int k) {
        arr=new int [k];
        front=0;
        rear=k-1;
        len=0;
        this.k=k;
        



        
    }
    
    public boolean insertFront(int value) {

        if(isFull())
        return false;
        else{
            front=(front-1+k)%k;
            arr[front]=value;
            len++;
            return true;


        }
    }
    
    public boolean insertLast(int value) {
           if(isFull())
        return false;
        else{
            rear=(rear+1)%k;
            arr[rear]=value;
            len++;
            return true;
            

        }
        
    }
    
    public boolean deleteFront() {
         if(isEmpty())
        return false;
        else{
            front=(front+1)%k;
           
            len--;
            return true;
            

        }
        
    }
    
    public boolean deleteLast() {
           if(isEmpty())
        return false;
        else{
            rear=(rear-1+k)%k;
           
            len--;
            return true;
            

        }
        
        
    }
    
    public int getFront() {
            if(isEmpty())
        return -1;
        else 
        return arr[front];
        
        
    }
    
    public int getRear() {
        if(isEmpty())
        return -1;
        else 
        return arr[rear];

        
    }
    
    public boolean isEmpty() {
    return     len==0;

        
    }
    
    public boolean isFull() {
        return len==k;

        
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */