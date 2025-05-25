class Solution {
    public int longestPalindrome(String[] words) {
        HashMap<String, Integer> freq = new HashMap<>();
        int ans = 0;
        boolean hasCenter = false;

        for (String word : words) {
            String reversed = new StringBuilder(word).reverse().toString();
            if (freq.getOrDefault(reversed, 0) > 0) {
                ans += 4;
                freq.put(reversed, freq.get(reversed) - 1);
            } else {
                freq.put(word, freq.getOrDefault(word, 0) + 1);
            }
        }

        for (String word : freq.keySet()) {
            if (word.charAt(0) == word.charAt(1) && freq.get(word) > 0) {
                hasCenter = true;
                break;
            }
        }

        if (hasCenter) ans += 2;

        return ans;
    }
}
