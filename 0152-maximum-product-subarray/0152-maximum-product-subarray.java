class Solution {
    public int maxProduct(int[] nums) {
        int suff_prt=1;
        int  pre_prt=1;
     

int max_prt= Integer.MIN_VALUE;


     
        for(int i=0;i<nums.length;i++)
        {
           pre_prt*=nums[i];
           suff_prt*=nums[nums.length-1-i];
           max_prt=Math.max(max_prt,Math.max(pre_prt,suff_prt));
           if(suff_prt==0)
           suff_prt=1;
             if(pre_prt==0)
           pre_prt=1;
           


        }
         return max_prt;

        
    }
}