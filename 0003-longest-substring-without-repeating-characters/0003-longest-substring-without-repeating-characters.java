class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int i=0;
        int j=0;
        int maxi=0;

        HashMap<Character,Integer>mp=new HashMap<>();

        while(j<n)
        {
            char ch=s.charAt(j);
            mp.put(ch,mp.getOrDefault(ch,0)+1);
            if(mp.get(ch)>1)
            {
                while(mp.get(ch)>1)
                {
                    char ch2=s.charAt(i);
                    mp.put(ch2,mp.get(ch2)-1);
                    i++;


                }

            }
            maxi=Math.max(maxi,j-i+1);
            j++;
            


        }
        return maxi;
        
    }
}