class Solution {
    public int minimumDeletions(int[] nums) {
        int n=nums.length;
        int min=nums[0];
        int max=nums[0];
        int mini=0;
        int maxi=0;
        for(int i=1;i<n;i++){
            if(nums[i]<min){
                min=nums[i];
                mini=i;
            }
            if(nums[i]>max){
                max=nums[i];
                maxi=i;
            }
        }
        int end=Math.max(maxi+1,mini+1);
        int start=Math.min(maxi+1,mini+1);
        int left=n-start+1;
        if(end<(start+(n-end+1)) && end<=left)
        return end ;
        else if(left<(start+(n-end+1)) && end>left)
        return left;
        else return start+(n-end+1);

    }
}