class Solution {
    public int longestSubarray(int[] nums) {
        int l=0,r=0,ans=0,c0=0;
        for(;r<nums.length;r++){
            if(nums[r]==0){
                c0++;
            }
        for(;c0>1;l++){
            if(nums[l]==0){
                c0--;
            }}
            ans=Math.max(ans,r-l+1);
        }
        return ans-1;
    }
}