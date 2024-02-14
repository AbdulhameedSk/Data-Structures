class Solution {
    public void moveZeroes(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                c++;
            }
        }
        int l=0;
        for(int r=0;r<nums.length;r++){
            if(nums[r]!=0){
                nums[l]=nums[r];
                l++;
            }
        }
        for(int i=l;i<nums.length;i++){
            nums[i]=0;
        }
    }
}