class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        HashSet<Integer>st=new HashSet<>();
        int maxi=0;
        int count=0;

        for(int i:nums)
        {
            st.add(i);

        }
        for(int i:st)
        {
            if(!st.contains(i-1))//this is the first element 
            {
              int   curr=i;
                count=0;
                while(st.contains(curr))
                {
                    curr=curr+1;
                    count+=1;

                }
                maxi=Math.max(count,maxi);



            }
        }

        return maxi;

    }
}