class Solution {
    public int removeDuplicates(int[] nums) {
        int l=0,r=0;
        for(int i=0;i<nums.length;i++){
            if(nums[r]!=nums[l]){
                nums[l+1]=nums[r];
                l++;
                r++;
            }else{
                r++;
            }
            
        }
        return l+1;
    }
}