class Solution {
    public String longestNiceSubstring(String s) {
    String result = "";
    int maxLength = 0;

    for (int i = 0; i < s.length(); i++) {
        for (int j = i + 1; j <= s.length(); j++) {
            String substring = s.substring(i, j);
            if (isNice(substring) && substring.length() > maxLength) {
                maxLength = substring.length();
                result = substring;
            }
        }
    }

    return result;
}

private boolean isNice(String s) {
    boolean[] uppercase = new boolean[26];
    boolean[] lowercase = new boolean[26];

    for (char c : s.toCharArray()) {
        if (Character.isUpperCase(c)) {
            uppercase[c - 'A'] = true;
        } else {
            lowercase[c - 'a'] = true;
        }
    }

    for (int i = 0; i < 26; i++) {
        if (uppercase[i] != lowercase[i]) {
            return false;
        }
    }

    return true;
}
}