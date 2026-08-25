class Solution {
    public int missingMultiple(int[] nums, int k) {
        int n=nums.length;
        // HashSet<Integer>st=new HashSet<>();
        // for(int i:nums)
        // {
        //     st.add(i);

        // }
    

        // for(int i=1;i<=100;i++)
        // {
        //     if(!st.contains(k*i))
        //     {
        //         return k*i;
           


        //     }
        // }
// return k*(n+1);
boolean [] visited=new boolean [n+1];
Arrays.fill(visited,false);


for(int i=0;i<nums.length;i++)
{
    if(nums[i]%k==0)
    {
   
    if(nums[i]>0  && nums[i]%k==0)
    {
         int idx=nums[i]/k;
         if(idx<=n)
    visited[idx]=true;
    }


    }
}
for(int i=1;i<visited.length;i++)
{
    if(!visited[i])
    return (i)*k;

}
return (n+1)*k;

        
    }
}