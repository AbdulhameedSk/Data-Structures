import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> matchingWords = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            int[] lps = computeLPS(words[i]);
            for (int j = 0; j < words.length; j++) {
                if (i == j) continue;
                if (isSubstringOf(words[i], words[j], lps)) {
                    matchingWords.add(words[i]);
                    break;
                }
            }
        }
        return matchingWords;
    }

    private int[] computeLPS(String sub) {
        int[] lps = new int[sub.length()];
        int i = 1, l = 0;
        while (i < sub.length()) {
            if (sub.charAt(i) == sub.charAt(l)) {
                l++;
                lps[i] = l;
                i++;
            } else {
                if (l > 0) {
                    l = lps[l - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }

    private boolean isSubstringOf(String sub, String main, int[] lps) {
        int mainIndex = 0, subIndex = 0;
        while (mainIndex < main.length()) {
            if (main.charAt(mainIndex) == sub.charAt(subIndex)) {
                mainIndex++;
                subIndex++;
                if (subIndex == sub.length()) return true;
            } else {
                if (subIndex > 0) {
                    subIndex = lps[subIndex - 1];
                } else {
                    mainIndex++;
                }
            }
        }
        return false;
    }
}
