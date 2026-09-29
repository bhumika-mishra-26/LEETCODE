class Solution {
      public int binarySearch(int [] nums,int s,int e,int target)
    {
        int idx=-1;

        while(s<=e)
        {
int mid=s+(e-s)/2;
if(nums[mid]==target)
{
    idx=mid;
    break;

}
else if(nums[mid]<target)
s=mid+1;
else
e=mid-1;

        }
        return idx;

    }
    public int findPivot(int [] nums)
    {
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
        return start ;

    }
    public int search(int[] nums, int target) {
        int n=nums.length;
         // minimum nikaal kar dono parts mai bs lgao simple 
int idx=0;

   int pivot=     findPivot(nums);
 idx=  binarySearch(nums,0,pivot-1,target);
 if(idx!=-1)
 {
    return idx;

 }
 return binarySearch(nums,pivot,nums.length-1,target);

 


        
    }
}