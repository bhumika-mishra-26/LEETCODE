class Solution {
    public int totalNumbers(int[] digits) {
        int n = digits.length;
        HashSet<Integer> st = new HashSet<>();
        int count = 0;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                for (int k = 0; k < n; k++) {
                    if (k == i || k == j || j == i) {
                        continue;

                    }
                    if (digits[i] != 0) {
                        if (digits[k] % 2 == 0) {

                            int number = digits[i] * 100 + digits[j] * 10 + digits[k];
                            if (!st.contains(number)) {
                                st.add(number);

                            }

                        }
                    }
                }
            }
        }
        return st.size();

    }
}