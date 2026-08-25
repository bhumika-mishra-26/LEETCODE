class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int [] ans=new int [nums2.length];
        Arrays.fill(ans,0);

        Stack<Integer>st=new Stack<>();

        for(int i=nums2.length-1;i>=0;i--)
        {
            while(!st.isEmpty() && st.peek()<nums2[i])
            {
                st.pop();

            }
            if(st.isEmpty())
            ans[i]=-1;
            else
            ans[i]=st.peek();
            st.push(nums2[i]);





        }
        HashMap<Integer,Integer>mp=new HashMap<>();
        for(int i=0;i<ans.length;i++)
        {
            mp.put(nums2[i],ans[i]);

        }
        int [] res=new int [nums1.length];
        for(int i=0;i<res.length;i++)
        {
            
                res[i]=mp.get(nums1[i]);
            
        }
        return res;

    }
}