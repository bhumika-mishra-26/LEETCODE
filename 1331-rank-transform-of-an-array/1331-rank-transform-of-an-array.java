class Solution {
    public int[] arrayRankTransform(int[] arr) {

        int[] sorted = arr.clone();
        Arrays.sort(sorted);

        HashMap<Integer, Integer> mp = new HashMap<>();

        int rank = 1;

        for (int num : sorted) {
            if (!mp.containsKey(num)) {
                mp.put(num, rank++);
            }
        }

        int[] ans = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            ans[i] = mp.get(arr[i]);
        }

        return ans;
    }
}