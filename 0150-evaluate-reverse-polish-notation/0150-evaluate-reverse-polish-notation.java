class Solution {
    public int evalRPN(String[] tokens) {
        int n=tokens.length;
    Stack<Integer>st=new Stack<>();
    for(int i=0;i<n;i++)
    {
        String ch=tokens[i];
        if(ch.equals("+") || ch.equals("/") || ch.equals("*") || ch.equals("-"))
        {
            int b=st.pop();
            int a=st.pop();
           if(ch.equals("+"))
           st.push(a+b);
           else if(ch.equals("-"))
           st.push(a-b);
            else if(ch.equals("/"))
           st.push(a/b);
            else if(ch.equals("*"))
           st.push(a*b);

        }
        else{
            st.push(Integer.parseInt(ch));
        }
    }
return st.pop();


    }
}