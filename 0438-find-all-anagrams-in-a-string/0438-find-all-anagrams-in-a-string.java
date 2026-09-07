class Solution {

    public boolean matches(int[] count1, int[] count2) {
        for(int i = 0; i < 26; i++) {
            if(count1[i] != count2[i])
                return false;
        }
        return true;
    }

    public List<Integer> findAnagrams(String s, String p) {

        ArrayList<Integer> ans = new ArrayList<>();

        int n1 = p.length();
        int n2 = s.length();

        if(n1 > n2)
            return ans;

        int[] p_count = new int[26];
        int[] s_count = new int[26];

        // First window
        for(int i = 0; i < n1; i++) {
            p_count[p.charAt(i) - 'a']++;
            s_count[s.charAt(i) - 'a']++;
        }

        // First window check
        if(matches(p_count, s_count))
            ans.add(0);

        // Sliding window
        for(int i = n1; i < n2; i++) {

            // Add new character
            s_count[s.charAt(i) - 'a']++;

            // Remove old character
            s_count[s.charAt(i - n1) - 'a']--;

            // Check window
            if(matches(p_count, s_count))
                ans.add(i - n1 + 1);
        }

        return ans;
    }
}