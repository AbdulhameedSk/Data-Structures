class Solution {
    public int findPeakElement(int[] nums) {
    
        int k = -1; // Initialize k to -1 (no peak found) initially

        if (nums.length > 1) {
            if (nums[0] >= nums[1]) {
                k = 0;
            } else if (nums[nums.length - 1] >= nums[nums.length - 2]) {
                k = nums.length - 1;
            } else {
                for (int i = 1; i < nums.length - 1; i++) {
                    if (nums[i] >= nums[i - 1] && nums[i] >= nums[i + 1]) {
                        k = i;
                        break; // Exit the loop once a peak is found
                    }
                }
            }
        } else if (nums.length == 1) {
            k = 0;
        }

        return k;
    }
}
