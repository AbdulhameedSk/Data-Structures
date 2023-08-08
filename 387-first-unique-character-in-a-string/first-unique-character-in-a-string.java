class Solution {
    public int firstUniqChar(String s) {
        Map<Character,Integer> map=new HashMap<>();
        for(var ch:s.toCharArray()){
            var count=map.containsKey(ch)?map.get(ch):0;
            map.put(ch,count+1);
        }
       
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
}
