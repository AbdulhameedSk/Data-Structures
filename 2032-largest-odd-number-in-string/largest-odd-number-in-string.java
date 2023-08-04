import java.math.BigInteger;

class Solution {
    public String largestOddNumber(String num) {
        BigInteger nums = new BigInteger(num);
         if (num.length() == 0) {
            return "";
        }
        if (nums.mod(BigInteger.valueOf(2)).equals(BigInteger.ONE)) {
            return num;
        } else {
            String temp = "";
    for (int i = num.length() - 1; i >= 0; i--) {
        char samp = num.charAt(i);
        if (Character.isDigit(samp) && (samp - '0') % 2 != 0) {
            temp = num.substring(0, i + 1);
            break;
                }
            }
            return temp;
        }
    }
}
