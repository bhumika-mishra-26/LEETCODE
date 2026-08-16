class Solution {
    public int nearestDrone(int[][] drones, int[] target) {
        int n=drones.length;
        int min=Integer.MAX_VALUE;
        int idx=-1;
        int dist=Integer.MAX_VALUE;


       
        for(int i=0;i<n;i++)
        {
            int [] d=drones[i];
            int a=d[0];
            int b=d[1];
            int c=d[2];
         dist=Math.abs(a-target[0])+Math.abs(b-target[1]);
         if(dist<=c && dist<min)
         {
            min=dist;
            idx=i;

         }


        }
        return idx;

    }
}