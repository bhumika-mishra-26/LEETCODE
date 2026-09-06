class Solution {
    public int countGoodRotations(int[] nums) {
      
     int n=nums.length;
     long half1=0;

     long total=0;
     for(int i:nums)
     {
        total+=i;

     }
     for(int i=0;i<n/2;i++)
     {

half1+=nums[i];


     }
     int ct=0;

     for(int i=0;i<n;i++)
     {
        if(2*half1>total)
        ct++;
        half1-=nums[i];
        half1+=nums[(i+n/2)%n];



     }
return ct;

        
    }
}