class Solution {
    public int uniqueXorTriplets(int[] nums) {
        final int MAX = 2048;   // 2^11

        boolean[] pairXor = new boolean[MAX];

        int n = nums.length;

        // All possible XORs of two elements (j <= k allowed)
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                pairXor[nums[i] ^ nums[j]] = true;
            }
        }

        boolean[] ans = new boolean[MAX];

        // XOR every pair result with every element
        for (int x = 0; x < MAX; x++) {
            if (!pairXor[x]) continue;
            for (int num : nums) {
                ans[x ^ num] = true;
            }
        }

        int count = 0;
        for (boolean b : ans) {
            if (b) count++;
        }

        return count;
    }
}