class Solution {
    public void solve(int idx,int [] nums,List<List<Integer>>ans,List<Integer>path)
    {
        if(idx==nums.length)
        {
            ans.add(new ArrayList<>(path));
            return ;

        }
        path.add(nums[idx]);
        // iclude 

        solve(idx+1,nums,ans,path);
        //backtrack

        path.remove(path.size()-1);
        //exclude 
        while (idx + 1 < nums.length && nums[idx] == nums[idx + 1]) {
            idx++;
        }
        solve(idx+1,nums,ans,path);



    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
          List<List<Integer>>ans=new ArrayList<>();
        int idx=0;
        List<Integer>path=new ArrayList<>();
        Arrays.sort(nums);


        solve(idx,nums,ans,path );
        return ans;
        
    }
}