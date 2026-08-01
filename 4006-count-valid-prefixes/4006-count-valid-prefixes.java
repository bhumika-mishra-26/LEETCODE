class Solution {
    public int countValidPrefixes(String s) {
        int n=s.length();
        int one=0;
        int zero=0;
        int res=0;

        
        for(char c:s.toCharArray())
        {
            if(c=='0')
            zero++;
            else if(c=='1')
            one++;
            if(Math.abs(zero-one)<=1)
            res++;

        }
        return res;
        
        
    }
}