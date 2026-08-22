class Solution {
    public int longestNiceSubarray(int[] nums) {
        int n=nums.length;
        int l=0;
        int r=0;
        int mask=0;
        int maxi=0;


        while(r<n)
        {
           

            while((mask & nums[r])!=0)
            {
               mask=mask^nums[l];
               
               l++;



            }
            mask|=nums[r];
            maxi=Math.max(maxi,(r-l+1));
            r++;



        }
        return maxi;

        
    }
}