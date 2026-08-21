class Solution {
    public double   solve(double x,long n)
    {
        // so n does not go out of bound 
        //time complexity is log n bcz we are dividing by two evry time 
        if(n==0)
        return 1;
        if(n<0)
      return   solve(1/x,-n);
        // so that if n is 214.... 2 raised to the power 31 it does not go out of boud when we convert it to integer
         // if n is even 
         if(n%2==0)
          return solve(x*x,n/2);
         else 
        return  x*solve(x*x,(n-1)/2);

    }
    public double myPow(double x, int n) {
   return      solve( x,(long)n);


        
    }
}