class Solution {
    public boolean equalFrequency(String word) {

        int[] freq = new int[26];

        // Count frequencies
        for (int i = 0; i < word.length(); i++) {
            freq[word.charAt(i) - 'a']++;
        }

        // Try removing one occurrence of each character
        for (int i = 0; i < 26; i++) {

            if (freq[i] == 0)
                continue;

            freq[i]--;

            int common = 0;
            boolean valid = true;

            for (int j = 0; j < 26; j++) {

                if (freq[j] == 0)
                    continue;

                if (common == 0) {
                    common = freq[j];
                } 
                else if (freq[j] != common) {
                    valid = false;
                    break;
                }
            }

            if (valid)
                return true;

            freq[i]++;
        }

        return false;
    }
}