class Solution {
    public void solve(int n,int open,int closed,List<String>ans,String res)
    {
        if(res.length()==2*n)
        {
            ans.add(res);
            return;

        }
        if(open<n)
        {
            solve(n,open+1,closed,ans,res+"(");

        }
        if(closed<open)
        {
                   solve(n,open,closed+1,ans,res+")");
        }
    }
    public List<String> generateParenthesis(int n) {
        int open=0;
        int closed=0;

        List<String>ans=new ArrayList<>();
        solve(n,open,closed,ans,"");
        return ans;

    
        
    }
}