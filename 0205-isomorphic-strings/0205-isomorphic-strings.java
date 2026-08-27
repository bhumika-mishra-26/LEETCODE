class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character>mp1=new HashMap<>();
        HashMap<Character,Character>mp2=new HashMap<>();
          int n1=s.length();
          int n2=t.length();
          if(n1!=n2)
          return false;
          for(int i=0;i<n1;i++)
          {
            char ch=s.charAt(i);
            char ch2=t.charAt(i);

            if(mp1.containsKey(ch) && mp1.get(ch)!=ch2)
            {
                return false;

            }
             if(mp2.containsKey(ch2) && mp2.get(ch2)!=ch)
            {
                return false;

            }
            mp1.put(ch,ch2);
            mp2.put(ch2,ch);

          }
return true;

        
    }
}