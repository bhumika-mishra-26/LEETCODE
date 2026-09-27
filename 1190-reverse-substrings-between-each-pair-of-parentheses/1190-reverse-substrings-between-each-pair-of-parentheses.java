class Solution {
    public String reverseParentheses(String s) {
        int n=s.length();
        Stack<String>st=new Stack<>();

    StringBuilder curr=new StringBuilder();
    for(int i=0;i<n;i++)
    {
        char ch=s.charAt(i);
        if(ch=='(')
        {
            st.push(curr.toString());
            curr=new StringBuilder();


        }
        else if(ch==')')
        {
            curr.reverse();

                String previous = st.pop();
                curr = new StringBuilder(previous + curr);


        }
        else
        curr.append(ch);


        
    }
    return curr.toString();

    }
}