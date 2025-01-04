class Solution {
    public int countPalindromicSubsequence(String s) {
        int ans = 0;
        char[] sc = s.toCharArray();
        int l = 0;
        int r = sc.length - 1;
        HashMap<Character, ArrayList<Integer>> mpp = new HashMap<>();
        for (int i = 0; i < sc.length; i++) {
            mpp.put(sc[i], mpp.getOrDefault(sc[i], new ArrayList<Integer>()));
            mpp.get(sc[i]).add(i);
        }
        for (Map.Entry<Character, ArrayList<Integer>> entry : mpp.entrySet()) {
            System.out.println("Character: " + entry.getKey() + " -> Indices: " + entry.getValue());
        }
        for (char c : mpp.keySet()) {
            if (mpp.get(c).size() > 1) {
                Set<Character> set = new HashSet<>();
                int first = mpp.get(c).get(0);
                int last = mpp.get(c).get(mpp.get(c).size() - 1);
                for (int j = first + 1; j < last; j++) { // Iterate between first and last index
                    set.add(sc[j]);
                }
                ans += set.size();
            }
        }
        return ans;
    }
}