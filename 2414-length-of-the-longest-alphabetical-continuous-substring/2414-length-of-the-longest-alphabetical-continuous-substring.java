class Solution {
    public int longestContinuousSubstring(String s) {
        int n=s.length();
        int count=1;
        int [] arr=new int [n];


        for(int i=0;i<n;i++)
        {
           
arr[i]=(int)s.charAt(i);

          

        }
        int maxi=1;

        for(int i=0;i<n-1;i++)
        {
            if(arr[i]+1==arr[i+1])
            {
                count+=1;

            }
            else{
                count=1;


            }
            maxi=Math.max(maxi,count);

        }
        return maxi;

        
    }
}