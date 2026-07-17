class Solution {
    
    // public  int recursion (int i,int j)
    // {
    //     if(i==0 || j==0)
    //     return 1;
    //     if(i<0 || j<0)
    //     return 0;
    //   int up=  recursion(i-1,j);
    //   int left=  recursion (i,j-1);
    //   return up+left;



    // }
    public int uniquePaths(int m, int n) {
      
    //   return   recursion(m-1,n-1);
      int [] dp=new int [n];

      Arrays.fill(dp,1);
      for(int i=1;i<m;i++)
      {
        for(int j=1;j<n;j++)
        {
           dp[j]=dp[j]+dp[j-1];

        }
      }
      return dp[n-1];




        
    }
}