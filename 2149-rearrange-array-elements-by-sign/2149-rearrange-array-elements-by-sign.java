class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;

        int [] positive=new int [n/2];
        int [] negative=new int [n/2];
        int i1=0;
        int i2=0;

        for(int i=0;i<n;i++){
            if(nums[i]>0)
            {
                positive[i1++]=nums[i];

            }
            else{
            negative[i2++]=nums[i];
            }

        }
        int [] ans=new int [n];
i1=0;
i2=0;

        for(int i=0;i<n;i++){
            if(i%2==0)
            {
                ans[i]=positive[i1++];


            }
            else{
                ans[i]=negative[i2++];

            }

        }
        return ans;

        
    }
}