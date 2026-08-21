class Solution {
    public int findDuplicate(int[] nums) {
        //cycle sort 
        // nums[i] ko hona chahiye id-1;


        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            int num=Math.abs(nums[i]);
            int id=num-1;
            if(nums[id]<0)
            return id+1;
            nums[id]=nums[id]*-1;

            

        }
        return 0;

        
    }
}