class Solution {
    public int compress(char[] chars) {
        int i=0;
        int n=chars.length;
        int ans=0;
        int count=0;
    


        while(i<n)
        {
            char curr=chars[i];
            count=0;

            while(i<n && curr==chars[i])
            {
                count++;
                i++;

            }
            chars [ans++]=curr;
            if(count>1)
            {
                for(char c:String.valueOf(count).toCharArray())
                {
                    chars [ans++]=c;
                    

                }
           


            }


        }
        return ans;

        
    }
}