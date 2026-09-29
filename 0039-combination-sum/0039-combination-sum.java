class Solution {
    public  void solve(int [] candidates,int target,List<List<Integer>>ans,List<Integer>res,int idx,int n)
    {
        if(idx==n)
        {
            return ;

        }
        if(target==0)
        {
            ans.add(new ArrayList<>(res));
            return;

        }
       
           
    if(candidates[idx]>target){
    return;
    }

     
        
        res.add(candidates[idx]);

        /// pick situation hogi ye ismeindex vhi rehne do
        solve(candidates,target-candidates[idx],ans,res,idx,n);
        res.remove(res.size()-1);

        // unpick situation mai sirf aage badhao 
        solve(candidates,target,ans,res,idx+1,n);


    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>>ans=new ArrayList<>();
        Arrays.sort(candidates);
        int idx=0;
        int n=candidates.length;

        solve(candidates,target,ans,new ArrayList<>(),0,n);
        return  ans;


    }
}