class Solution {
    public int missingMultiple(int[] nums, int k) {
        int n=nums.length;
        HashSet<Integer>st=new HashSet<>();
        for(int i:nums)
        {
            st.add(i);

        }
    

        for(int i=1;i<=100;i++)
        {
            if(!st.contains(k*i))
            {
                return k*i;
           


            }
        }
return k*(n+1);


        
    }
}