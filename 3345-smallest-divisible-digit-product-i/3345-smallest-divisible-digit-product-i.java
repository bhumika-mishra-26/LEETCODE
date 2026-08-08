class Solution {
    public int smallestNumber(int n, int t) {
        while(true)
        {
            int prt=1;
            int x=n;
            while(x>0)
            {
                prt*=(x%10);
                x=x/10;

            }
            if(prt%t==0)
            return n;
            n++;

        }
        
    }
}