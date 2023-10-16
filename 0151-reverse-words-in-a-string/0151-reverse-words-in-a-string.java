class Solution {
    public String reverseWords(String s) {
        Stack<String> st=new Stack<>();
        String[] arr=(s.split(" "));
        for(String u:arr){
            st.push(u);
        }
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
            sb.append(" ");
        }
        String anssp=sb.toString().trim();
        String stringWithoutSpaces = anssp.replaceAll("\\s+", " ");
        return stringWithoutSpaces;
    }
}
