class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        Stack<Integer>st=new Stack<>();


        int [] greater=new int [n2];
        for(int i=n2-1;i>=0;i--)
        {
            while(!st.isEmpty() && st.peek()<=nums2[i])
            {
                st.pop();

            }
            if(st.isEmpty())
            {
                greater[i]=-1;

            }
            else{
                greater[i]=st.peek();

            }
            st.push(nums2[i]);

        }
HashMap<Integer,Integer>mp=new HashMap<>();
for(int i=0;i<n2;i++)
{
    mp.put(nums2[i],greater[i]);

}
int [] ans=new int [n1];
for(int i=0;i<n1;i++)
{
    ans[i]=mp.get(nums1[i]);
}
return ans;
        
    }
}