class Solution {
    public int findGcd(int a ,int b)
    {
        if(b==0)
        return a;
       return  findGcd(b,a%b);

    }
    public int gcdOfOddEvenSums(int n) {
     int sumOdd=(int)Math.pow(n,2);
     int sumEven=n*(n+1);

return findGcd(sumOdd,sumEven);

        
    }
}