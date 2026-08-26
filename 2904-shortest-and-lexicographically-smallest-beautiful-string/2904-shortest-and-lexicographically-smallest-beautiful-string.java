class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        String ans="";

        for(int i=0;i<s.length();i++)
        {
            StringBuilder str=new StringBuilder();
            int oneCount=0;
            String curr="";


            for(int j=i;j<s.length();j++)
            {
                str.append(s.charAt(j));
                if(s.charAt(j)=='1')
                {
                    oneCount++;

                }
                if(oneCount>k)
                break;
                if(oneCount==k)
                {
                     curr=str.toString();

                

if(ans.length()==0 || curr.length()<ans.length()||(curr.length()==ans.length() &&  curr.compareTo(ans)<0))
{
    ans=curr;

}
                }



            }
        }
        return ans;

        
    }
}