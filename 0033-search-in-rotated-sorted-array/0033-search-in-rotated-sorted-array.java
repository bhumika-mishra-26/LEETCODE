class Solution {
    public int findPivot(int[] nums) {
        int l = 0;
        int r = nums.length - 1;

        while (l < r) {
            int mid = l + (r - l) / 2;

            if (nums[mid] > nums[r]) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }

        return l;
    }

    public int binarySearch(int l, int r, int[] nums, int target) {
        int idx = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] == target) {
                idx = mid;
                break;

            } else if (nums[mid] < target) {
                l = mid + 1;

            } else {
                r = mid - 1;

            }
        }
        return idx;

    }

    //isme humlog sabse pehle chota index find karenge 
    public int search(int[] nums, int target) {

        int n = nums.length;

        int pivot_index = findPivot(nums);

        int idx = binarySearch(0, pivot_index - 1, nums, target);

        if (idx != -1)
            return idx;

        return binarySearch(pivot_index, n - 1, nums, target);

    }
}