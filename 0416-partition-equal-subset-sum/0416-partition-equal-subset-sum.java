class Solution {

    public boolean canPartition(int[] nums) {

        int n = nums.length;
        int sum = 0;

        for(int x : nums)
            sum += x;

        // If total sum is odd partition is impossible
        if(sum % 2 != 0)
            return false;

        int s = sum / 2;

        boolean[][] dp = new boolean[n+1][s+1];

      
        for(int i=0;i<=n;i++)
            dp[i][0]=true;

        for(int j=1;j<=s;j++)
            dp[0][j]=false;

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=s;j++)
            {
                if(nums[i-1] > j)
                {
                    dp[i][j]=dp[i-1][j];
                }
                else
                {
                    dp[i][j]=dp[i-1][j] ||
                             dp[i-1][j-nums[i-1]];
                }
            }
        }

        return dp[n][s];
    }
}