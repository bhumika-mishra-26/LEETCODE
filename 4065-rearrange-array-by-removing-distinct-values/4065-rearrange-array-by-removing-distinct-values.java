class Solution {
    public int[] rearrangeArray(int[] nums) {
        int [] freq=new int [101];
        int n=nums.length;

        for(int i:nums)
        {
            freq[i]++;

        }
        int idx=0;
        int [] ans=new int [n];

while(idx<n)
{
        for(int i=1;i<=100;i++)
        {
        if(freq[i]>0)
            {
                ans[idx++]=i;
                freq[i]-=1;


            }

        }
}
        return ans;

        
    }
}