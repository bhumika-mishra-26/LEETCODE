class Solution {
    public int longestConsecutive(int[] nums) {

        HashSet<Integer> st = new HashSet<>();

        for (int num : nums) {
            st.add(num);
        }

        int maxi = 0;

        for (int num : st) {

            // num is the starting point
            if (!st.contains(num - 1)) {

                int curr = num;
                int count = 0;

                while (st.contains(curr)) {
                    count++;
                    curr++;
                }

                maxi = Math.max(maxi, count);
            }
        }

        return maxi;
    }
}