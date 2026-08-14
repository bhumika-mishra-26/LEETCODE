class Solution {
    public int maximumLengthSubstring(String s) {
        int n=s.length();
    int i=0;
    int j=0;
    int maxi=0;

    HashMap<Character,Integer>mp=new HashMap<>();

    while(j<s.length())
    {
        char ch=s.charAt(j);
        mp.put(ch,mp.getOrDefault(ch,0)+1);
        
        while(mp.get(ch)>2)
        {
            char c=s.charAt(i);
            mp.put(c,mp.get(c)-1);
            i++;

        }
maxi=Math.max(maxi,j-i+1);
j++;




    }
    return maxi;

        
    }
}