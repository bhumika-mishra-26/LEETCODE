class Solution {
    public int characterReplacement(String s, int k) {
        int [] count=new int [26];
        int i=0;
        int j=0;
        int n=s.length();
        int maxi_freq=0;
        int maxi=0;


        
        while(j<n)
        {
            char ch=s.charAt(j);
            count[ch-'A']++;
            maxi_freq=Math.max(maxi_freq,count[ch-'A']);
            int window=j-i+1;
            while(window-maxi_freq>k)
            {
                count[s.charAt(i)-'A']--;
                i++;
                window=j-i+1;



            }
            maxi=Math.max(maxi,window);
            j++;


           

        }
        return maxi;
        
        
    }
}
