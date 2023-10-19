class Solution {
    public boolean backspaceCompare(String s, String t) {
        return get(s).equals(get(t));
    }

    public static String get(String u) {
        int hash = 0;
        StringBuilder stb = new StringBuilder();

        for (int i = u.length() - 1; i >= 0; i--) {
            if (u.charAt(i) == '#') {
                hash++;
            } else {
                if (hash > 0) {
                    hash--;
                } else {
                    stb.append(u.charAt(i));
                }
            }
        }
        
        return stb.toString();
    }
}
