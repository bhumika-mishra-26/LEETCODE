class Solution {
    public long  gcd (int a,int b)
    {
        if(b==0)
        return a;
        return gcd(b,a%b);

    }
    public long maxPairStrength(int[] nums) {
       long maxi=0;
       for(int i=0;i<nums.length;i++)
       {
        for(int j=i+1;j<nums.length;j++)
        {
            long num=((long)nums[i]*(long)nums[j]);
            long den=gcd(nums[i],nums[j]);
            den=den*den;
            
            maxi=Math.max(maxi,num/den);


        }
       }
return maxi;


        
    }
}