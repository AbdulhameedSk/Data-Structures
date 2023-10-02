class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int r=0,l=0,ans=0;
        long sum=0;
        for(;r<nums.length;r++){
            sum=sum+nums[r];
            for(;(nums[r]*(r-l+1))-sum>k;l++){
                sum-=nums[l];
            }
            ans=Math.max(ans,r-l+1);
        }
        return ans;
    }
}