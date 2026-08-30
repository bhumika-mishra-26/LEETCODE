class Solution {
    public void twoSum(int i, int j, int ntarget, List<List<Integer>> ans, int[] nums, int target) {
        
        while (i < j) {
            int sum = nums[i] + nums[j];

            if (sum < ntarget) {
                i++;
            } 
            else if (sum > ntarget) {
                j--;
            } 
            else {
                ans.add(Arrays.asList(target, nums[i], nums[j]));
                i++;
                j--;

                while (i < j && nums[i] == nums[i - 1]) i++;
                while (i < j && nums[j] == nums[j + 1]) j--;
            }
        }
    }

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 0; i <= nums.length - 3; i++) {

            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int t = nums[i];
            twoSum(i + 1, nums.length - 1, -t, ans, nums, t);
        }

        return ans;
    }
}