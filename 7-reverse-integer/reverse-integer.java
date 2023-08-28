class Solution {
    public int reverse(int x) {
        int rem = 0;
        boolean negative = false;
        int rev = 0;
        if(x==Integer.MIN_VALUE){
            return 0;
        }
        if (x < 0) {
            negative = true;
            x = Math.abs(x);
        }
        
        while (x != 0) {
            if (rev > Integer.MAX_VALUE / 10) { // check for integer overflow
                return 0;
            }
            rem = x % 10;
            rev = rev * 10 + rem;
            x = x / 10;
        }
        
        if (negative) {
            rev = -rev;
        }
        
        return rev;
    }
}
