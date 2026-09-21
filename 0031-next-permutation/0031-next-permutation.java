class Solution {
    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public void reverse(int[] nums, int i, int j) {
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }

    public void nextPermutation(int[] nums) {
     int n=nums.length;
     int swap_idx=-1;
     int sec=-1;

     for(int i=n-2;i>=0;i--)
     {
        if(nums[i]<nums[i+1])
        {
            swap_idx=i;
            break;




        }
     }
     if(swap_idx==-1){
     reverse(nums,0,n-1);
     return ;
     }
     for(int i=n-1;i>=swap_idx;i--)
     {
        if(nums[i]>nums[swap_idx])
        {
            sec=i;
            break;

        }
     }
     swap(nums,swap_idx,sec);
     reverse(nums,swap_idx+1,n-1);

    }
}