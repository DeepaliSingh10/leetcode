import java.util.*;

class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int n = nums.length;

        if (n == 0) return ans;

        Arrays.sort(nums);

        int k = 1;

        for (int i = nums[0] + 1; i < nums[n - 1]; i++) {
            if (k < n && nums[k] == i) {
                k++;
            } else {
                ans.add(i);
            }
        }

        return ans;
    }
}