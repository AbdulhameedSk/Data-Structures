class Solution {
    public int missingNumber(int[] nums) {
        int s2=0;
        for(int i=0;i<nums.length;i++){
            s2+=nums[i];
        }
        int l=nums.length;
        int s1=l*(l+1)/2;
        return s1-s2;
    }
}