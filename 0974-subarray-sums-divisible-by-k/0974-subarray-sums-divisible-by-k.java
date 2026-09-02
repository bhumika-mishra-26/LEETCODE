class Solution {
    // dekho isme kya hpga we will calculate the prefix sum and har ek point par sum %k karnege agar humlog ko same rem milta h aage bhi to humlog na ek aise subarray mil gya h jo ki divisible by k hoga aur negative rem handle karne ke liye +k kardena or else answer galat hoga 
    // example 
    // [3,2,1,0,2,3]
    // [har point par sum nikalte hue %k check karo aur agar vo rem aage bhi exist karta h to ek aisa suvarray mil gya h jo ki divisible by k hoga ]
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer>mp=new HashMap<>();
        mp.put(0,1);
        int n=nums.length;
        int rem=0;
        int sum=0;
        int count=0;


        for(int i=0;i<n;i++)
        {
            sum+=nums[i];
            rem=sum%k;
            if(rem<0)
            {
                rem=rem+k;

            }
            if(mp.containsKey(rem))
            {
                count+=mp.get(rem);
                mp.put(rem,mp.get(rem)+1);


            }
            else{

            
            mp.put(rem,1);
            }

        }
        return count;


        
    }
}