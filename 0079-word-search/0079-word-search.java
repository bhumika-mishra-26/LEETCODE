class Solution {

    public boolean dfs(char [][]board,String word,int i,int j,int m,int n,int idx)
    {
        if(idx==word.length())
        return true;

        if(i<0 || i>=m ||j<0 || j>=n || word.charAt(idx)!=board[i][j] || board[i][j]=='$')
        return false;
       char original= board[i][j];
       board[i][j]='$';



        int [] [] dir={{-1,0},{1,0},{0,1},{0,-1}};
        for(int [] d:dir)
        {
            int nr=d[0]+i;
            int nc=d[1]+j;
        if(   dfs(board,word,nr,nc,m,n,idx+1)==true)
        {
            return true;

        }

        }
        board[i][j]=original;
        return false;



    }
    public boolean exist(char[][] board, String word) {
        int m=board.length;
        int n=board[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(word.charAt(0)==board[i][j] &&  dfs(board,word,i,j,m,n,0))
                {
                   
                 return true;


                }
            }
        }
        return false;
        
    }
}