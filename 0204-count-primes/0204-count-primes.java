class Solution {


    // 1. Standard sieve of eratosthenes complexity =nlog(lon n)
    // 2.first make a boolean array of size n+1
    // 3.now mark all of them as true;starting from 2 to less than n 
    // 4.now for each nums[i] as true mark all its multiples as false from 2 till sqrt n 
    
    public int countPrimes(int n) {
        boolean [] primes=new boolean  [n+1];
        for(int i=2;i<n;i++)
        {
            primes[i]=true;

        }
        for(int i=2;i*i<=n;i++)
        {
            if(primes[i]==true)
            {
                for(int j=i*i;j<=n;j+=i)
                {
                    primes[j]=false;

                }
            }
        }
        int count=0;

        for(int i=2;i<n;i++)
        {

if(primes[i]==true)
count+=1;

        }
        return count;


        
    }
}