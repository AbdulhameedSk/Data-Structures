class Solution {
    public int singleNumber(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(findnum(nums,nums[i])==1){
                return nums[i];
            }
        }
        return -1;
    }
    public static int findnum(int[] nums,int n){
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==n){
                c++;
            }
        }
        return c;
    }
}