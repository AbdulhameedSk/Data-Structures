class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int prod = 1, l = 0, ans = 0;
        for (int r = 0; r < nums.length; r++) {
            prod *= nums[r];
            if (prod >= k) {
                while (prod >= k && l <= r) {
                    prod /= nums[l];
                    l++;
                }
            } 
                ans += (r - l) + 1;

        
        }
        return ans;
    }
}