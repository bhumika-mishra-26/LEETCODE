class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int ele1=Integer.MAX_VALUE;
                int ele2=Integer.MIN_VALUE;
                int temp=matrix[i][j];

                for(int k=0;k<n;k++)
                {
                    ele1=Math.min(ele1,matrix[i][k]);

                }
                for(int k=0;k<m;k++)
                {
                    ele2=Math.max(ele2,matrix[k][j]);

                }
                if(temp==ele1  && temp==ele2)
                ans.add(temp);




            }
        }
        return ans;


    }
}