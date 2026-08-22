class Solution {
    public int longestNiceSubarray(int[] nums) {
        
        int n=nums.length;
        int len=0;
        
        for(int i=0;i<n;i++)
        {
            int c=1;
            int used=nums[i];

            for(int j=i+1;j<n;j++)
            {
                if((used & nums[j])==0)
                {
// isse humko saari set bits milengi 

used=used | nums[j];

                    c+=1;

                }
                else{
                    break;
                    
                }
            }
            len=Math.max(len,c);

        }
        return len;

    }
}