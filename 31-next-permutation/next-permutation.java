class Solution {
    public static void sortFromIndexToEnd(int[] arr, int startIndex) {
        if (startIndex < 0 || startIndex >= arr.length - 1) {
            return;
        }
        int[] subArray = Arrays.copyOfRange(arr, startIndex, arr.length);
        Arrays.sort(subArray);
        System.arraycopy(subArray, 0, arr, startIndex, subArray.length);
    }

    public void nextPermutation(int[] nums) {
        boolean c = false;
        int i;
        for (i = nums.length - 1; i > 0; i--) {
            if (nums[i] > nums[i - 1]) {
                c = true;
                break;
            }
        }

        if (c) {
            for (int j = nums.length - 1; j >= i; j--) {
                if (nums[j] > nums[i - 1]) {
                    int temp = nums[i - 1];
                    nums[i - 1] = nums[j];
                    nums[j] = temp;
                    break;
                }
            }
        }
        sortFromIndexToEnd(nums, i);
    }
}
