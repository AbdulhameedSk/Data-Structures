class Solution {
    public boolean isPowerOfFour(int n) {
        //lognbase4 should be natural number 
        return Math.log(n)/Math.log(4)%1==0;
    }
}