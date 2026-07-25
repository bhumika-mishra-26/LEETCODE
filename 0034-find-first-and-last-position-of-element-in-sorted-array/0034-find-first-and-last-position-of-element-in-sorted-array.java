class Solution {
    public int findLeftMost(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        int ans = -1;

        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] == target)
            //ye answer ho skta h par yahi hoga we r not sure 
            // so we travel to further left of the array 
            {
                ans = mid;
                r = mid - 1;

            } else if (nums[mid] < target) {
                l = mid + 1;
            } else
                r = mid - 1;

        }
        return ans;
    }
  public int findRightMost(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        int ans = -1;

        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] == target)
            //ye answer ho skta h par yahi hoga we r not sure 
            // so we travel to further right of the array 
            {
                ans = mid;
                l = mid + 1;

            } else if (nums[mid] < target) {
                l = mid + 1;
            } else
                r = mid - 1;

        }
        return ans;
    }

    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        
        int left_most=findLeftMost(nums,target);
        int right_most=findRightMost(nums,target);
        return new int []{left_most,right_most};


        
    }
}