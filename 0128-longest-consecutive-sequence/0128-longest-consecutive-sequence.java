class Solution {
    public int longestConsecutive(int[] nums) {

        int n = nums.length;

        if (n == 0) return 0;

        Arrays.sort(nums);

        int max = 1;
        int total = 1;

        for (int i = 0; i < n - 1; i++) {

            if (nums[i + 1] == nums[i] + 1) {
                total++;
            } 
            else if (nums[i + 1] != nums[i]) {
                total = 1;
            }

            max = Math.max(max, total);
        }

        return max;
    }
}