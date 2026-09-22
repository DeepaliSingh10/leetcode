import java.util.*;

class Solution {
    public int findPairs(int[] nums, int k) {
        int n = nums.length;
        Set<List<Integer>> sets = new HashSet<>();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                if (Math.abs(nums[i] - nums[j]) == k) {
                    int a = Math.min(nums[i], nums[j]);
                    int b = Math.max(nums[i], nums[j]);

                    sets.add(Arrays.asList(a, b));
                }
            }
        }

        return sets.size();
    }
}