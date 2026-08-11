class Solution {
    public int missingInteger(int[] nums) {
        int n = nums.length;

        // Find sum of longest consecutive prefix
        int sum = nums[0];

        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1] + 1) {
                sum += nums[i];
            } else {
                break;
            }
        }

        // Sort the array
        Arrays.sort(nums);

        // Find the smallest number >= sum that is missing
        for (int i = 0; i < n; i++) {
            if (nums[i] < sum) {
                continue;
            }

            if (nums[i] == sum) {
                sum++;
            } else {
                return sum;
            }
        }

        return sum;
    }
}