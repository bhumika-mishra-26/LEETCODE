class Solution {
    public int maximumUniqueSubarray(int[] nums) {

        int n = nums.length;
        int i = 0;
        int j = 0;

        HashSet<Integer> st = new HashSet<>();

        int sum = 0;
        int ans = 0;

        while(j < n) {

            while(st.contains(nums[j])) {
                st.remove(nums[i]);
                sum -= nums[i];
                i++;
            }

            st.add(nums[j]);
            sum += nums[j];

            ans = Math.max(ans, sum);

            j++;
        }

        return ans;
    }
}