class Solution {
    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0"))
            return "0";
        // now we perform multiplication of two strings 
        //isme what we do first is we perfrom multiplcation of a digit of mum2 with all digit of num 1
        //iske baad result array banega that will be of size m+n
        //jo digit aaegi that will be stored at index i+j+1
        // and carry willl be stored just before that so it will be stored at index i+j
              int n1 = num1.length();
        int n2 = num2.length();

int [] result=new int  [n1+n2];
//this will hold result array


  
        for (int i = n1 - 1; i >= 0; i--) {
            for (int j = n2 - 1; j >= 0; j--) {
                int digit1=num1.charAt(i)-'0';
                int digit2=num2.charAt(j)-'0';
                int mul=digit1*digit2;
                //position where the result will be stored 
                int pos_d=i+j+1;
                int pos_c=i+j;
                //yahan par carry stored hoga 
                int sum=result[pos_d]+mul;
                //ye result mai carry add karenge 
                //ab actual result stored hoga 
                result[pos_d]=sum%10;
                result[pos_c]+=sum/10;
            }
        }
                StringBuilder sb=new StringBuilder();
              boolean leadingZero = true;

for (int digit : result) {
    if (leadingZero && digit == 0)
        continue;

    leadingZero = false;
    sb.append(digit);
}

                return sb.toString();



    }
}
