class Solution {
    public long subArrayRanges(int[] nums) {
        long total=0;
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            int mini=nums[i];
            int maxi=nums[i];


            for(int j=i+1;j<n;j++)
            {
                mini=Math.min(mini,nums[j]);
                 maxi=Math.max(maxi,nums[j]);
                 total+=(maxi-mini);


            }


        }
        return total;
        
    }
}