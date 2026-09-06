class Solution {
    public int countRotations(String s, int k) {
        int n=s.length();
        int ct=0;
        int count=0;



       for(int st=0;st<n;st++)
       {
        ct=0;
        
        for(int i=0;i<n-1;i++)
        {
            char c1=s.charAt((st+i)%n);
            char c2=s.charAt((st+i+1)%n);
            if(c1==c2)
            {
                ct++;


            }
        }
            if(ct==k)
            {
                count++;


            }

        }   
        return count;
            
}}