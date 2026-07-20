class Solution {
    public int firstMissingPositive(int[] nums) {
        int n=nums.length;
        //isme pehle dekh lenge ki 1  present h ya nhi agar h to jo >nums and <0 wale numbers h usse humko matlab hi nhi h to we will leave that and make them to 1 par condition ye h ki 1 ki check pehle kar lenge hum log 
          //
          //ab hum har nums[i] par jayengae aur number ko mark kardenge with engative sign let us say a num[i]=3 to ye index 2 par hona chhaiye to index 2 will be marked matlab iss index par humlog aa chuke h 
          boolean onePresent=false;

         for(int i=0;i<n;i++)
         {
            if(nums[i]==1)
            {
                onePresent =true;

            }
            if(nums[i]>n || nums[i]<=0)
            nums[i]=1;


         }
         if(onePresent==false)
         return 1;
         for(int i=0;i<n;i++)
         {
            int num=Math.abs(nums[i]);
            int idx=num-1;
            if(nums[idx]<0 )
            continue;

            nums[idx]*=-1;
    

         }
         for(int i=0;i<n;i++)
         {//
        // matlab iss index par kabhi humlog aae hi nhi h to idx+1 wla number missing h 
            if(nums[i]>0)
            return i+1;


         }
         return n+1;





        
    }
}