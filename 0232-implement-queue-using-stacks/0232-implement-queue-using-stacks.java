class MyQueue {


// isme what we do is we create two stacks for queue implementation one will be the input stack and the other will be the output stack so what we do is we put new eleemnts in the input stack but jab pop and poll ki baari aaegi we can just pop elemts from the output stack isf it is not empty if empty saare elemts nikaal lo input se and output mai daal do 

Stack<Integer>input=new Stack<>();
Stack<Integer>output=new Stack<>();


    public MyQueue() {
        
    }
    
    public void push(int x) {
        input.push(x);

        
        
    }
    
    public int pop() {
        if(!output.isEmpty())
        {
            return output.pop();



        }
        else 
        {
            while(!input.isEmpty())
            {
                output.push(input.pop());


            }
            return output.pop();

        }

        
    }
    
    public int peek() {
        if(!output.isEmpty())
        {
            return output.peek();

        }
        else{
            while(!input.isEmpty())
            {
                output.push(input.pop());


            }
            return output.peek();
            

        }
    }
    
    public boolean empty() {
        if(output.size()==0 &&  input.size()==0)
        return true;
        else 
        return false;

        
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */