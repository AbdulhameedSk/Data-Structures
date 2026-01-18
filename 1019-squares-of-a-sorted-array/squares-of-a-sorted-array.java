class Solution {
    public int[] sortedSquares(int[] nums) {
        int l=nums.length;
        int[] ans=new int[l];
        for(int i=0;i<l;i++){
            ans[i]=nums[i]*nums[i];
        }
        Arrays.sort(ans);
        return ans;
    }
}