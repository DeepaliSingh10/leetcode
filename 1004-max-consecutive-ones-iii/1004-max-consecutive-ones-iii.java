class Solution {
    public int longestOnes(int[] nums, int k) {

        int n = nums.length;
        int ans = 0;
        int zeros=0;
        int left=0;
        //int count=0;
        for (int i = 0; i < n; i++) {
            int count=0;
            if(nums[i]==0)
            zeros++;
            
            while(zeros>k){
                if(nums[left]==0)
                {
                    zeros--;
                }
                left++;
            }
            ans=Math.max(ans,i-left+1);
        }
        return ans;
    }
}