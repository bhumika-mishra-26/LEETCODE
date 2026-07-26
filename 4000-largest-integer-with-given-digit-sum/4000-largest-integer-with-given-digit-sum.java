class Solution {
    public int largestInteger(int n, int s) {
        if(s==0)
        return 0;
        if(9*n<s)
        return -1;
        

        StringBuilder str=new StringBuilder();
        for(int i=0;i<n;i++)
        {
            int d=Math.min(9,s);
            str.append(d);

            s=s-d;


        }
        return Integer.parseInt(str.toString());

    }
}