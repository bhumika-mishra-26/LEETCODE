class Solution {
    public String smallestPalindrome(String s) {
        int n = s.length();
        if(n==1)
        {
            return  s;
        }
        int[] freq = new int[26];
        char[] c = s.toCharArray();
        Arrays.fill(freq,0);

        for (char ch : c) {
            freq[ch - 'a']++;

        }
        int i = 0;
        int j = n - 1;
        char[] ans = new char[n];

        while (i < j) {
            for (int f = 0; f < 26; f++) {
                if (freq[f] >= 2) {
                    ans[i] = (char) (f + 97);
                    ans[j] = (char) (f + 97);
                    freq[f]-=2;

                    i++;
                    j--;
                    break;

                }
            }
        }
        if (n % 2 == 1) {
            for (int f = 0; f < 26; f++) {
                if (freq[f] == 1) {
                    ans[n / 2] = (char) (f + 97);

                }
            }
        }
       return new String(ans);


    }
}