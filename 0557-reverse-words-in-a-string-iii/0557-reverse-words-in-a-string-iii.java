class Solution {
    public String reverseWords(String s) {
        StringBuilder finalResult = new StringBuilder();
        String[] words = s.split(" ");
        
        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word).reverse();
            
            if (finalResult.length() > 0) {
                finalResult.append(" ");
            }
            
            finalResult.append(reversedWord);
        }
        
        return finalResult.toString();
    }
}