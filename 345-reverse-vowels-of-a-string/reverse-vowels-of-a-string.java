class Solution {
    public String reverseVowels(String s) {
        StringBuilder sb = new StringBuilder();
        StringBuilder vowels = new StringBuilder(); // Use StringBuilder to store vowels
        
        // Step 1: Extract and store vowels in reverse order
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (isVowel(c)) {
                vowels.append(c);
            }
        }
        
        // Step 2: Replace original vowels with reversed vowels
        int a = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (isVowel(c)) {
                sb.append(vowels.charAt(a));
                a++;
            } else {
                sb.append(c);
            }
        }
        
        return sb.toString();
    }
    
    // Helper method to check if a character is a vowel
    private boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}
