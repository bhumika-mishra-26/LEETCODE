class Solution {
    public String countAndSay(int n) {
        if(n==1)
        return "1";
        String res=countAndSay(n-1);
        StringBuilder str=new StringBuilder();

        for(int i=0;i<res.length();i++)
        {
            int count=1;
            char ch=res.charAt(i);
            while(i<res.length()-1 && res.charAt(i)==res.charAt(i+1))
            {
                count++;
                i++;


            }
            str.append(count);
            str.append(ch);

        }
        return str.toString();

        
    }
}