class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder str=new StringBuilder();
        int counter=0;
        for(char c:s.toCharArray())
        {
            if(c==')' )
            {
counter-=1;

            }
             if(counter!=0 )
            str.append(c);
          
             if(c=='(' )
                counter+=1;
            
            
        }
        return str.toString();

    }
}