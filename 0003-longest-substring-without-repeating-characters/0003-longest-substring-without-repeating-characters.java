import java.util.HashMap;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int length = 0, maxLength = 0, l = 0,r=0;;
        HashMap<Character, Integer> mp = new HashMap<>();
        for (; r < s.length(); r++) {       
            mp.put(s.charAt(r), mp.getOrDefault(s.charAt(r), 0) + 1);
            length++;
           for (;mp.get(s.charAt(r)) > 1;l++) {
                mp.put(s.charAt(l), mp.get(s.charAt(l)) - 1);
                length--;
      
            }
            maxLength = Math.max(maxLength, length);
        }
        return maxLength;
    }
}
