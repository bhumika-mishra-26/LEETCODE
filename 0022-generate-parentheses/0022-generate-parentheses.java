class Solution {
    public void solve(int n,int open,int closed,String res, List<String>ans)
    {
        if(res.length()==2*n)
        {
            ans.add(res);
            return ;

        }
        if(open<n)

        {
            solve(n,open+1,closed,res+"(",ans);

        }
        if(closed<open)
        
        {
            solve(n,open,closed+1,res+")",ans);
            
        }
    }
    
    public List<String> generateParenthesis(int n) {
        List<String>ans=new ArrayList<>();
        int open=0;
        int closed=0;
        // closed will be less than = to  oopen  and opne will be equal to n 
        solve(n,open,closed,"",ans);
        return ans;

        
    }
}