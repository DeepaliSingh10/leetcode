class Solution {
    public String lexGreaterPermutation(String s, String target) {
        int n = s.length();
        int[] count = new int[26];

        // Count characters in s
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }

        // Try to match target from left to right
        int i = 0;

        while (i < n && count[target.charAt(i) - 'a'] > 0) {
            count[target.charAt(i) - 'a']--;
            i++;
        }

        // If we couldn't match everything, try to make
        // the answer greater by changing a previous position.
        while (i >= 0) {

            if (i < n) {
                int current = target.charAt(i) - 'a';

                // Find the smallest character greater than target[i]
                for (int c = current + 1; c < 26; c++) {
                    if (count[c] > 0) {

                        StringBuilder ans = new StringBuilder();

                        // Prefix same as target
                        ans.append(target.substring(0, i));

                        // Make this position greater
                        ans.append((char) ('a' + c));
                        count[c]--;

                        // Add remaining characters in sorted order
                        for (int j = 0; j < 26; j++) {
                            while (count[j] > 0) {
                                ans.append((char) ('a' + j));
                                count[j]--;
                            }
                        }

                        return ans.toString();
                    }
                }
            }

            // Backtrack:
            // restore the character used at target[i]
            i--;

            if (i >= 0) {
                count[target.charAt(i) - 'a']++;
            }
        }

        // No permutation is greater than target
        return "";
    }
}