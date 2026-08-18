class Solution {
    public int largestInteger(int[] nums, int k) {
        int n=nums.length;
        int maxi1=-1;
        int [] count=new int [51];


        for(int i:nums)
        {
            count[i]++;

            maxi1=Math.max(maxi1,i);

        }

        if( k==n)
        return maxi1;
        int maxi2=-1;
        for(int i=0;i<n;i++)
        {
            if (count[nums[i]]==1 && (k==1 || i==0 || i==n-1))
            maxi2=Math.max(maxi2,nums[i]);

        }
      
return maxi2;


        
    }
}