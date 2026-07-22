class Solution {
    public double solve(double x,long n)
    {
        if(n==0)
        return 1;
        if(n<0)
      return  solve(1/x,-n);

        if(n%2==0)
      return   solve(x*x,n/2);
        else
      return   x*solve(x*x,(n-1)/2);

    }
    public double myPow(double x, int n) {
        // n is odd 
        // n*pow(n*n,n-1/2);
        //n is even 
        // pow(x*x,x/2)
    return     solve(x,(long)n);

     

        
    }
}