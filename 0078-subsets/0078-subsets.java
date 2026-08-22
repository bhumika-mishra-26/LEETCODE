class Solution {
    // isme har elemnts at any index ke paas do options honge either take that elemtn or not take that element 
    public void solve(int idx,int [] nums,List<List<Integer>>ans,List<Integer>path )
    {
        if(idx==nums.length)
        {
            ans.add(new ArrayList<>(path));
            return ;


        }
        path.add(nums[idx]);

        solve(idx+1,nums,ans,path);
        path.remove(path.size()-1);
        solve(idx+1,nums,ans,path);

    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>ans=new ArrayList<>();
        int idx=0;
        List<Integer>path=new ArrayList<>();

        solve(idx,nums,ans,path );
        return ans;


        
    }
}