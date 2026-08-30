
class Solution {
    int islands=0;

    public void bfs (char [][]grid,int i,int j,int m,int n)
    {
         int [][]directions={{1,0},{-1,0},{0,-1},{0,1}};
         Queue<int[]>pq=new LinkedList<>();
         pq.offer(new int []{i,j});
         grid[i][j]='0';

         while(!pq.isEmpty())
        {
          int []p=pq.poll();
          int a=p[0];
          int b=p[1];
          

            for(int []dir:directions)
            {
          int row=  a+    dir[0];
           int col=  b+   dir[1];
           if(row<m && row>=0 && col>=0 && col<n && grid[row][col]=='1' ){
           pq.offer(new int []{row,col});
           grid[row][col]='0';
           }
          

            }
        }


        
    


    }
    public int numIslands(char[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
       

         
          



        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j]=='1')
                {
                    islands+=1;
                    bfs(grid,i,j,m,n);
                    
                }
            }
        }
        return islands;
    }
}
        