class Solution {
    public void moveZeroes(int[] nums) {
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[k++]=nums[i];
            }
        }
        for(int next=k;next<nums.length;next++){
            nums[next]=0;
        }
    }
}