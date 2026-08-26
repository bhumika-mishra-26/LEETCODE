class Solution {
    public boolean isPalindromic(String s) {
        int n=s.length();
        StringBuilder str=new StringBuilder();

        for(int i=0;i<n;i++)
        {
            char ch=s.charAt(i);
            String bin=Integer.toBinaryString(ch);
            if(bin.length()<8)
            {
                bin="0"+bin;

            }

            str.append(bin);

        }
        int i=0;
        int j=str.length()-1;
        while(i<j)
        {
            if(str.charAt(i)!=str.charAt(j))
            {
                return false;

            }
            i++;
            j--;

        }  
        return true;

    }
}