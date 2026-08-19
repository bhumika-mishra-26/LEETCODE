class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int n1=bookings.length;
        int m=bookings[0].length;

        int [] ans=new int [n];
        for(int i=0;i<n1;i++)
        {
            int a=bookings[i][0];
            int b=bookings[i][1];
            int c=bookings[i][2];


            for(int j=a;j<=b;j++)
            {
                ans[j-1]=ans[j-1]+c;

            }
        }
        return ans;


    }
}