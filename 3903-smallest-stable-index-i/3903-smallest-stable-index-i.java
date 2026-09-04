class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;
        int start=0;
        int max=0;
        int ans=n-1;
        int count=0;
        for(int i=0;i<n;i++){
            max=Math.max(max,nums[i]);
            int min=nums[i];
            for(int j=i+1;j<n;j++){
                if(min>nums[j])
                min=nums[j];
            }
           int diff=max-min;
           if(diff<=k){
            count=1;
            ans=Math.min(i,ans);
           }

        }
        if(count==0)
        return -1;
        else return ans;
    }
}