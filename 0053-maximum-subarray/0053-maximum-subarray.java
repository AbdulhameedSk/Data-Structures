class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0,maxi=nums[0];
        for(int i=0;i<nums.length;i++){
           if(sum<0){
                sum=0;
            }  sum+=nums[i];
           
            maxi=Math.max(maxi,sum);
        }
        return maxi;
    }
}