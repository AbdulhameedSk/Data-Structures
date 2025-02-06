class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] ans = new int[nums.length];
        int idx = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                ans[idx] = nums[i];
                if (idx < nums.length - 2) {
                    idx = idx + 2;
                }
            }

        }
        idx = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                ans[idx] = nums[i];
                if (idx < nums.length - 2) {
                    idx = idx + 2;
                }
            }
        }
        return ans;
    }
}