class Solution {
    public int maxSubArray(int[] nums) {
        int sum=nums[0],maxi=nums[0];
        for(int i=1;i<nums.length;i++){
            if(sum<0){
                sum=0;
            }
            sum=sum+nums[i];
            maxi=Math.max(sum,maxi);
        }
        return maxi;
    }
}