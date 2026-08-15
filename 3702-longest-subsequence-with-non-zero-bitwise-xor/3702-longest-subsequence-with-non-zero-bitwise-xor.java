class Solution {
    public int longestSubsequence(int[] nums) {
        int n=nums.length;
        int ans=nums[0];
        int count=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0)
            count++;
            else break;
        }
        if(count == n)
        return 0;
        
        for(int i=1;i<n;i++){
            ans=ans ^ nums[i];
        }
        if(ans==0){
            return n-1;
        }
        else 
        return n;
    }
}