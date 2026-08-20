class Solution {

    public int[] resultArray(int[] nums) {

        int n = nums.length;

        int arr1[] = new int[n];
        int arr2[] = new int[n];

        arr1[0] = nums[0];
        arr2[0] = nums[1];

        int k = 1;
        int j = 1;

        for (int i = 2; i < n; i++) {

            if (arr1[k - 1] > arr2[j - 1]) {
                arr1[k++] = nums[i];
            } 
            else {
                arr2[j++] = nums[i];
            }
        }

        int[] ans = new int[n];
        int index = 0;

        for (int i = 0; i < k; i++) {
            ans[index++] = arr1[i];
        }

        for (int i = 0; i < j; i++) {
            ans[index++] = arr2[i];
        }

        return ans;
    }
}