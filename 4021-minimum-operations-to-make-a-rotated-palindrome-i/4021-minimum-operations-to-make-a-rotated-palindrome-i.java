class Solution {
    public int minOperations(String s) {
        int n=s.length();
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            int cost=i;

            String sample=s.substring(i)+s.substring(0,i);
            for(int j=0;j<s.length()/2;j++)
            {
                char a=sample.charAt(j);
                char b=sample.charAt(n-1-j);
                int a1=Math.abs(a-b);
                cost+=Math.min(a1,26-a1);

            }
            ans=Math.min(ans,cost);


        }
        return ans;


        
    }
}