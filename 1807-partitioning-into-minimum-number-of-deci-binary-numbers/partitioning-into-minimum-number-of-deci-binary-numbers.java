class Solution {
    public int minPartitions(String n) {
        int maxDigit = 0; // Initialize the maxDigit to 0
        
        for (int i = 0; i < n.length(); i++) {
            char digit = n.charAt(i);
            int numericValue = Character.getNumericValue(digit);
            
            // Update maxDigit if the current digit is greater
            if (numericValue > maxDigit) {
                maxDigit = numericValue;
            }
        }
        
        return maxDigit;
    }
}
