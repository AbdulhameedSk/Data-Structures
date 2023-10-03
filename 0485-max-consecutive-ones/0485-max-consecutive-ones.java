class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int r=0,l=0,ans=0,c0=0;
        for(;r<nums.length;r++){
            if(nums[r]==0){
                c0++;
            }
            for(;c0>0 && l<=r;l++){
                if(nums[l]==0){
                    c0--;
                }
            }
            ans=Math.max(ans,r-l+1);
        }
        return ans;
    }
}