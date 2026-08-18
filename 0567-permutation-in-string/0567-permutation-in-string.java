import java.util.Arrays;

class Solution {
    public boolean checkInclusion(String s1, String s2) {

        int n = s1.length();
        int n1 = s2.length();

        if (n > n1) {
            return false;
        }

        int[] arr = new int[26];

        // Frequency of characters in s1
        for (int i = 0; i < n; i++) {
            arr[s1.charAt(i) - 'a']++;
        }

        int[] freq = new int[26];

        int left = 0;

        for (int right = 0; right < n1; right++) {

            freq[s2.charAt(right) - 'a']++;
            if (right - left + 1 > n) {
                freq[s2.charAt(left) - 'a']--;
                left++;
            }
            if (right - left + 1 == n) {
                if (Arrays.equals(arr, freq)) {
                    return true;
                }
            }
        }

        return false;
    }
}