class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] prefixSum = new int[n];
        int[] suffixSum = new int[n];
        int[] result = new int[n];

        // Compute prefix sum
        prefixSum[0] = 0; // No elements to the left of the first element
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + nums[i - 1];
        }

        // Compute suffix sum
        suffixSum[n - 1] = 0; // No elements to the right of the last element
        for (int i = n - 2; i >= 0; i--) {
            suffixSum[i] = suffixSum[i + 1] + nums[i + 1];
        }

        // Calculate the absolute difference between prefixSum and suffixSum
        for (int i = 0; i < n; i++) {
            result[i] = Math.abs(prefixSum[i] - suffixSum[i]);
        }

        return result;
    }
}
