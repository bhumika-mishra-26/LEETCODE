class Solution {
    public String minWindow(String s, String t) {
        int n=s.length();
        int i=0;
        int j=0;
        int m=t.length();
        if(n<m)
        return "";
        // dekho isme humko har character ki count ko dec karenge jo usme aa chuka uss particular window mai 
        HashMap<Character,Integer>mp=new HashMap<>();
            for(char c:t.toCharArray())
        {
            mp.put(c,mp.getOrDefault(c,0)+1);

        }
           int start_i=0;
        int minWindow=Integer.MAX_VALUE;
        char []str=s.toCharArray();
        char [] target=t.toCharArray();
        int count=m;

        while(j<n)
        {
            char ch=str[j];
            if(mp.getOrDefault(ch, 0) > 0)
           {
           count--;

            // mtlb vo character h s  t mai 
           
           }
             mp.put(ch,mp.getOrDefault(ch,0)-1);
            while(count==0)
            // mtlb humlog window ko shrink karenge 
            {
                int currWindow=j-i+1;
                if(minWindow>currWindow)
                {
                    minWindow=currWindow;
                    start_i=i;


                }
                mp.put(str[i],mp.getOrDefault(str[i],0)+1);
                if(mp.get(str[i])>0)
{
    count++;
}
i++;

            }


j++;



        }
        
return minWindow==Integer.MAX_VALUE?"":s.substring(start_i,start_i+minWindow);
    

        
    }
}