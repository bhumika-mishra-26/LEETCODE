class Solution {
    public void solve(int [] candidates,int target,List<List<Integer>>ans,List<Integer>res,int idx)
    {
           if(target==0)
        {
        ans.add(new ArrayList<>(res));
        return ;

        }
        if(idx==candidates.length)
        {
            return ;

        }
        if(candidates[idx]>target)
        {
            return ;

        }
     
    res.add(candidates[idx]);
    // ek baaar add karo uss number aur idx update na karo 
    solve(candidates,target-candidates[idx],ans,res,idx);
    // unpick situtation
    res.remove(res.size()-1);
    solve(candidates,target,ans,res,idx+1);

    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>>ans=new ArrayList<>();
        Arrays.sort(candidates);

        
        solve(candidates,target,ans,new ArrayList<>(),0);

return  ans;


        
    }
}