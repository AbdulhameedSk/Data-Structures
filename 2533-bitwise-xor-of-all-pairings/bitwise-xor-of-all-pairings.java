class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int ans = 0;
        
        // XOR all elements in nums1 if the length of nums2 is odd
        if (nums2.length % 2 == 1) {
            for (int num : nums1) {
                ans ^= num;
            }
        }
        
        // XOR all elements in nums2 if the length of nums1 is odd
        if (nums1.length % 2 == 1) {
            for (int num : nums2) {
                ans ^= num;
            }
        }
        
        return ans;
    }
}
