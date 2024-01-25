class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int l = 0, r = 0;
        double badichut = Integer.MIN_VALUE;
        for (; r < nums.length; r++) {
            double chut = 0; 
            if (r - l + 1 == k) {
                int sum = 0;
                for (int i = l; i <= r; i++) {
                    sum += nums[i];
                }
                chut = (double) sum / k;
                badichut = Math.max(badichut, chut);
            }
            while (r - l + 1 >= k) {
                l++;
            }
        }
        return badichut;
        
    }
}
