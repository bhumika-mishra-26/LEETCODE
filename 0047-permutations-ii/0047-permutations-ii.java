class Solution {

    public void swap(int[] nums, int f, int s) {
        int temp = nums[f];
        nums[f] = nums[s];
        nums[s] = temp;
    }

    public void solve(int idx, int[] nums, int n, List<List<Integer>> ans) {

        if(idx == n) {
            ArrayList<Integer> res = new ArrayList<>();

            for(int i : nums) {
                res.add(i);
            }

            ans.add(res);
            return;
        }

        HashSet<Integer> st = new HashSet<>();

        for(int i = idx; i < nums.length; i++) {

            // Same value ko same level par dobara choose nahi karna
            if(st.contains(nums[i]))
                continue;

            st.add(nums[i]);

            swap(nums, i, idx);

            solve(idx + 1, nums, n, ans);

            swap(nums, i, idx);
        }
    }

    public List<List<Integer>> permuteUnique(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();

        int n = nums.length;

        solve(0, nums, n, ans);

        return ans;
    }
}