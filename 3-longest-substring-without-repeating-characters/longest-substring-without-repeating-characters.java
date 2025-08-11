class Solution {
    public int lengthOfLongestSubstring(String s) {
        int size=0;
        if(s.length()==1){
            return 1;
        }
        ArrayList<Character> al=new ArrayList<>();
        for(char c:s.toCharArray()){          
            if(al.contains(c)){
                size=Math.max(size,al.size());
while (al.contains(c)) {
    al.remove(0); 
}
                al.add(c);
            }
            else{
                al.add(c);
            }
            size= Math.max(al.size(),size);
            
        }
        return size;
    }
}