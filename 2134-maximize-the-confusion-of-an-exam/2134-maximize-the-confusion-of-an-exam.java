class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int maxLen = 0;
       for (char c : new char[] { 'T', 'F' }) {
            int letterCounts = 0;
            int start = 0;
            
            for (int i = 0; i < answerKey.length(); i++) {
                if (answerKey.charAt(i) == c) {
                    letterCounts++;
                }
                
                for(;i - start + 1 - letterCounts > k;start++) {
                    if (answerKey.charAt(start) == c) {
                        letterCounts--;
                    }
                }
                maxLen = Math.max(maxLen, i - start + 1);
            }
        }
        return maxLen;
    }
}
