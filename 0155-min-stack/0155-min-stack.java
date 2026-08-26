// class MinStack {
//     // isme we create two stacks first one will be the actual stack but in second one we push only if the min stack ka top bada h and ye wla element is chota 
//     // jab pop karna hoga all we need to do is if the actual stack ka top is equal to min elelement ka top we just top the first element ka top 
//     Stack<Integer> actual = new Stack<>();
//     Stack<Integer> minStack = new Stack<>();

//     public MinStack() {

//     }

//     public void push(int value) {
//         actual.push(value);
//         if (minStack.isEmpty() || minStack.peek() >= value) {
//             minStack.push(value);

//         }

//     }

//     public void pop() {
//         if(actual.isEmpty())
//         return ;

//         if (minStack.peek().equals(actual.peek()))
        
//            minStack.pop();
           

       
//             actual.pop();

        
      


//     }

//     public int top() {
       
//             return actual.peek();

        
//     }

//     public int getMin() {
//         if (!minStack.isEmpty())
//             return minStack.peek();
//         else
//             return -1;

//     }
// }

// /**
//  * Your MinStack object will be instantiated and called as such:
//  * MinStack obj = new MinStack();
//  * obj.push(value);
//  * obj.pop();
//  * int param_3 = obj.top();
//  * int param_4 = obj.getMin();
 class MinStack {
    Stack<Integer>actual;
    Stack<Integer>minStack;


    public MinStack() {
        actual=new Stack<>();
        minStack=new Stack<>();

        
    }
    
    public void push(int value) {
        actual.push(value);
       

        if(minStack.isEmpty() || value<=minStack.peek())
        {
            minStack.push(value);


        }

        
    }
    
    public void pop() {
        if(actual.isEmpty())
        return ;
        if(minStack.peek().equals(actual.peek()))
        minStack.pop();
        actual.pop();


        
    }
    
    public int top() {
        if(actual.isEmpty())
        {
            return  -1;

        }
        return actual.peek();

        
    }
    
    public int getMin() {
        if(minStack.isEmpty())
        return  -1;
        return minStack.peek();

        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */