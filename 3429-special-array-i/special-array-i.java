class Solution {
    public boolean isArraySpecial(int[] nums) {
        if (nums.length <= 1) {
            return true;
        }
        int c1 = 1, c2 = 1;

        for (int i = 0; i < nums.length - 1; i++) {
            if ((nums[i] % 2 == 0 && nums[i + 1] % 2 != 0) || (nums[i] % 2 != 0 && nums[i + 1] % 2 == 0)) {
                c1++;
            }
        }

        if (c1 == nums.length) {
            return true;
        }
        return false;
    }
}
