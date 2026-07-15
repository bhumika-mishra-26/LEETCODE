class Solution {
    public boolean isPalindrome(String s)
    {
        int i=0;
        int j=s.length()-1;
        while(i<j)
        {
            if(s.charAt(i)!=s.charAt(j))
            {
                return false;

            }
            else{
                i++;
                j--;

            }
        }
        return true;

    }
    public String longestPalindrome(String s) {
        String ans="";

        for(int i=0;i<s.length();i++)
        {
            StringBuilder str=new StringBuilder();
            for(int j=i;j<s.length();j++)
            {
                str.append(s.charAt(j));
                {
                    String temp=str.toString();

                    if(isPalindrome(temp))
                    {
                        if(ans.length()<temp.length())
                        {
                            ans=temp;

                        }
                    }
                }           }
        }
        return ans;
        
    }
}