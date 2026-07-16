class Solution {
    public int longestOnes(int[] nums, int k) {
        int i=0;
        int j=0;
        int zeroCount=0;
        int maxi=0;


        while(j<nums.length)
        {
            if(nums[j]==0)
            {
                zeroCount+=1;
                while(zeroCount>k)
                {
                    if(nums[i]==0)
                    {
                        zeroCount--;

                    }
                    i++;


                }
            }

                maxi=Math.max(maxi,j-i+1);
                j++;



            }
        
        return maxi;
    }
}