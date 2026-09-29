class Solution {
    public String addBinary(String a, String b) {
        int n1=a.length();
        int n2=b.length();
        char [] s1=a.toCharArray();
        char [] s2=b.toCharArray();
        int  i=n1-1;
        int j=n2-1;
        int carry=0;
        StringBuilder str=new StringBuilder();
        int sum=0;


        while(i>=0 || j>=0 || carry!=0)
        {
            int num1=i>=0?s1[i]-'0':0;
            int num2=j>=0?s2[j]-'0':0;
         sum=num1+num2+carry;
            carry=sum/2;
            str.append(sum%2);
            i--;
            j--;
      





        }
return str.reverse().toString();

        
    }
}