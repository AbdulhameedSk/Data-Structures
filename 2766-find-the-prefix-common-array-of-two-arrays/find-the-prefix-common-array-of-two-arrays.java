class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int[] freq = new int[A.length + 1];
        int[] ans = new int[A.length];
        int c = 0;

        for (int i = 0; i < A.length; i++) {
            freq[A[i]]++;
            freq[B[i]]++;
            if (freq[A[i]] == 2) {
                c++;
            }
            if (A[i] != B[i] && freq[B[i]] == 2) {
                c++;
            }
            ans[i] = c;
        }
        return ans;
    }
}
