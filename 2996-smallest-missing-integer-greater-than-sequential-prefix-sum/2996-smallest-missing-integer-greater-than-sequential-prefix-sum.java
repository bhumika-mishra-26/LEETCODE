class Solution {
    public int missingInteger(int[] nums) {
        int n=nums.length;
       
     int    pre=nums[0];

        for(int i=1;i<n;i++)
        {
          if(nums[i]==nums[i-1]+1)
          pre+=nums[i];
          else 
          break;



        }
        HashSet<Integer>st=new HashSet<>();
        for(int i:nums)
        {
            st.add(i);

        }
while(st.contains(pre))
{
    pre++;


}
return pre;

        
        
    }
}