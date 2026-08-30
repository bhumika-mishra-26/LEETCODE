class Solution {
    public int numberOfSubarrays(int[] nums, int k) {

        HashMap<Integer, Integer> mp = new HashMap<>();

        // Prefix sum 0 initially 1 time
        mp.put(0, 1);

        int sum = 0;
        int ans = 0;

        for (int num : nums) {

            // Odd = 1, Even = 0
            if (num % 2 != 0) {
                sum++;
            }

            // need previous prefix sum = sum - k
            if (mp.containsKey(sum - k)) {
                ans += mp.get(sum - k);
            }

            // Store current prefix sum
            mp.put(sum, mp.getOrDefault(sum, 0) + 1);
        }

        return ans;
    }
}