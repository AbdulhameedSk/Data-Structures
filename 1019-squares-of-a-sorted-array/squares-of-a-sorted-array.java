class Solution {
    public int[] sortedSquares(int[] nums) {
        int l=0,r=nums.length-1,idx=r;
        int[] ans=new int[idx+1];
        while(l<=r){
            int left=nums[l]*nums[l];
            int right=nums[r]*nums[r];
            ans[idx--]=Math.max(left,right);
            if(left>right){
                l++;
            }else{
                r--;
            }
        }
        return ans;
    }
}