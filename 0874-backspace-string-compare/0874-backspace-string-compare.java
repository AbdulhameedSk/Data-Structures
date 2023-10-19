class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> s1 = new Stack<>();
        
        // Process string s
        for (int i = 0; i < s.length(); i++) { // Initialize i to 0
            if (s.charAt(i) == '#') {
                if (!s1.isEmpty()) {
                    s1.pop();
                }
            } else {
                s1.push(s.charAt(i));
            }
        }
        
      
        Stack<Character> t1 = new Stack<>();
        
        // Process string t
        for (int i = 0; i < t.length(); i++) { // Initialize i to 0
            if (t.charAt(i) == '#') {
                if (!t1.isEmpty()) {
                    t1.pop();
                }
            } else {
                t1.push(t.charAt(i));
            }
        }
        
        while(!s1.isEmpty() && !t1.isEmpty()){
            char u=s1.pop();
            char v=t1.pop();
            if(u!=v){
                return false;
            }
        }
        return s1.isEmpty()&&t1.isEmpty();
    }
}