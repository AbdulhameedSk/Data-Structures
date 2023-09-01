class Solution {
    public int[] countBits(int n) {
        int[] arr = new int[n + 1]; 
        for (int i = 0; i <= n; i++) {
            arr[i] = bin(i);
        }
        return arr; 
    }

    public int bin(int x) {
        if (x == 0) {
            return 0;
        }
        return bin(x / 2) + x % 2;
    }
}