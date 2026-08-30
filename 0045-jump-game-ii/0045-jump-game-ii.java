class Solution {
    public int jump(int[] nums) {
        int n=nums.length;
        int l=0;
        int r=0;
        int jumps=0;
        int maxi=0;

        while(r<n-1)
        {
            int farthest=0;
            for(int i=l;i<=r;i++ )
            {
                farthest=Math.max(farthest,nums[i]+i);

            }
            jumps++;
            l=r;

        r=farthest;
        maxi=Math.max(maxi,jumps);


        }
        return maxi;

        
    }
}