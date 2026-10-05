class Solution {
    public int minRotations(String s) {
        int n=s.length();
        int mini=0;

int digit=0;

        for(int i=0;i<n;i++)
        {
            int curr=s.charAt(i)-'0';
         digit=(curr-digit+10)%10;

            


            mini+=Math.min(digit,(10-digit));
            digit=curr;




        }
        return mini;

        
    }
}