class Solution {
    public int characterReplacement(String s, int k) {
        /// isme dekho har character ki freq store karni hogi kyuki ussi se humko pta lgega ki kitne 
        //characters need to be changed jo ki hoga widnowsize-maxfreq >k tabhi we will reduce the window size 
int n=s.length();
int [] freq=new int [26];
int maxi=0;
int maxi_freq=0;


int i=0;
int j=0;
while(j<n)
{
    char ch=s.charAt(j);

    freq[ch-'A']++;
    maxi_freq=Math.max(maxi_freq,freq[ch-'A']);

    int window=j-i+1;
    // i slide karna hoga 
while(window-maxi_freq>k)
{
    freq[s.charAt(i)-'A']--;
    i++;
    window=j-i+1;


}
maxi=Math.max(maxi,window);
j++;



}

return maxi;

        
    }
}