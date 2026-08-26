class Solution {
    public int[] asteroidCollision(int[] asteroids) {

        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < asteroids.length; i++) {

            int curr = asteroids[i];

            while (!st.isEmpty() && curr < 0 && st.peek() > 0) {

                int sum = st.peek() + curr;

                if (sum < 0) {
                    // Current negative asteroid destroys stack top
                    st.pop();
                }
                else if (sum > 0) {
                    // Stack top destroys current asteroid
                    curr = 0;
                }
                else {
                    // Both destroy each other
                    st.pop();
                    curr = 0;
                }
            }

            // If current asteroid survived, push it
            if (curr != 0) {
                st.push(curr);
            }
        }

        int[] ans = new int[st.size()];
        int id = st.size() - 1;

        while (!st.isEmpty()) {
            ans[id--] = st.pop();
        }

        return ans;
    }
}