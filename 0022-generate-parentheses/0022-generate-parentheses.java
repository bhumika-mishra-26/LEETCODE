class Solution {
    public void solve(List<String>ans,int n,int open,int closed,String res)
    {
        if(res.length()==2*n)
        {
            ans.add(res);
            return ;

        }
        if(open<n)
        {
            solve(ans,n,open+1,closed,res+"(");

        }
        if(closed<open)
        {
            solve(ans,n,open,closed+1,res+")");

        }
    }

    public List<String> generateParenthesis(int n) {
        List<String>ans=new ArrayList<>();
        int open=0;
        int closed=0;
        // isme open will always be less than n and clsoed should not be geater than open if so the strings generated are invalid 
        solve(ans,n,open,closed,"");
        return ans;

        
    }
}