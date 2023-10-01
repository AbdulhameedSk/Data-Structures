class Solution {
    public int longestSubarray(int[] nums) {
        int ans=0,c0=0,max=0,l=0,r=0;
        for(;r<nums.length;r++){
            if(nums[r]==0){
                c0++;
            }
            for(;c0>1;l++){
                if(nums[l]==0){
                    c0--;
                }

            }
            max=Math.max(max,r-l+1);
        }
        return max-1;
    }
}