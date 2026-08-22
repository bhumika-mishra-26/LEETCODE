class Solution {
    public boolean matches (int [] count1,int [] count2 )
    {
        for(int i=0;i<26;i++)
        {
            if(count1[i]!=count2[i])
            return false;

        }
        return true;

    }
    public boolean checkInclusion(String s1, String s2) {
        int n1=s1.length();
        int n2=s2.length();
        if(n1>n2)
        return false;

       
        int [] s1_count=new int [26];
        int [] s2_count=new int [26];
        Arrays.fill(s1_count,0);
        Arrays.fill(s2_count,0);

        for(int i=0;i<n1;i++)
        {
            s1_count[s1.charAt(i)-'a']++;
            s2_count[s2.charAt(i)-'a']++;

        }
  
    if(matches(s1_count,s2_count))
    return true;
    
    
    for(int i=n1;i<n2;i++)
    {
      s2_count[s2.charAt(i)-'a']++;
      s2_count[s2.charAt(i-n1)-'a']--;
      if(matches(s1_count,s2_count))
      return true;



    }
        return false;

        
    }
}