class Solution {
    public int maxAscendingSum(int[] nums) {
        int l=0,r=1,maxi=nums[0],now=nums[0];
        if(nums.length==1){
            return nums[0];
        }
        while(r<nums.length && l<nums.length){
            if(nums[r]>nums[r-1]){
                now+=nums[r];
                maxi=Math.max(now,maxi);
                r++;
                System.out.print(now+" ");
            }else{
                System.out.print("change");
                l=r;
                now=nums[l];
r++;            
            }
        }
        return Math.max(now,maxi);
    }
}