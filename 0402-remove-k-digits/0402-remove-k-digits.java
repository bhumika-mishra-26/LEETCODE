class Solution {
    // isme dekho ek string h jaise ki 1234 to hulog hamesha small number banane ke liye 
    // increasing order mai numbers ko place krte h aur hamesha msb wali digit ko pop krte h agar increasing order mai nhi h kyuki vhi digit badi hogi hamesha inc order seq follow hoga 
    public String removeKdigits(String num, int k) {
        Stack<Character>st=new Stack<>();
        for(char c:num.toCharArray())
        {
            while(!st.isEmpty() && st.peek()>c && k>0)
            {
                st.pop();
                k-=1;


            }
            st.push(c);

            
        }
        while(!st.isEmpty() && k>0)
        {
           st.pop();
           k-=1;
           


        }
        StringBuilder str=new StringBuilder();
         while(!st.isEmpty() )
        {
           str.append(st.pop());
           

        }

str.reverse();
int id=0;
while(id<str.length() && str.charAt(id)=='0')
{
    id++;

}
StringBuilder res=new StringBuilder(str.substring(id));
return res.length()==0?"0":res.toString();


        
    }
}