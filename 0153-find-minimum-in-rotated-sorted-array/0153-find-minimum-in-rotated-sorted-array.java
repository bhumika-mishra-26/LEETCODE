class Solution {
    public int findMin(int[] nums) {
int start=0;
        int end=nums.length-1;
        // dekho isme na <= waali condition nhi laegi taaaki loops mai na fase 

        while(start<end)
        {
            int mid=start+(end-start)/2;
            // matlab sabse chota index na right side hi hoga 
            if(nums[mid]>nums[end])
            {
                start=mid+1;



            }
            else{
                end=mid;
                // kyuki r bhi mid ho skta h means vo bhi ans ho skta h 


            }

        }
        return nums[start] ;
        
    }
}