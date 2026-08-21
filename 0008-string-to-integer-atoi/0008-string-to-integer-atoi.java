class Solution {
    public int myAtoi(String s) {
        s=s.trim();
        int n=s.length();
        if(n==0)
        return 0;
        int i=0;
        int sign=1;

        if(s.charAt(i)=='-')
        {
            sign=-1;
            i++;

        }
        else  if(s.charAt(i)=='+')
        {
            i++;


        }
        long  res=0;

        while(i<n)
        {
            char ch=s.charAt(i);
            if(ch<'0' || ch>'9')
            break;
            res=res*10+(ch-'0');
            if(res*sign>Integer.MAX_VALUE)
            return Integer.MAX_VALUE;
            else if(res*sign <Integer.MIN_VALUE)
            return Integer.MIN_VALUE;
            i++;





        }
        return (int)res*sign;


    }
}