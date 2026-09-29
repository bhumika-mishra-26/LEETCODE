class Solution {
    public int[] plusOne(int[] digits) {
        int n=digits.length;
        for(int i=n-1;i>=0;i--)
        {
            if(digits[i]+1<10)
            {
                digits[i]+=1;
                return digits;

            }
            // 5,9 wale case ke liye 6,0 ho jayega kyuki vo 
            digits[i]=0;

        }
        // 9,9,9,9 wla case ke liye 
int [] ndigits=new int [n+1];
ndigits[0]=1;
return ndigits;

        
    }
}