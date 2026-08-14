class Solution {
    public int maximumLengthSubstring(String s) {
        int n = s.length();
        HashMap<Character, Integer> map = new HashMap<>();
        int ans = 0;

        for (int i = 0; i < n; i++) {
            int count = 0;
            int right = i;
            map.clear();

            while (right < n) {
                char ch = s.charAt(right);

                map.put(ch, map.getOrDefault(ch, 0) + 1);

                if (map.get(ch) > 2) {
                    break;
                }

                count++;
                right++;
            }

            ans = Math.max(ans, count);
        }

        return ans;
    }
}