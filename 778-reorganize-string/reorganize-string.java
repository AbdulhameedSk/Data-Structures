class Solution {
    public String reorganizeString(String s) {
        HashMap<Character,Integer> mpp=new HashMap<>();
        for(char ch:s.toCharArray()){
            mpp.put(ch,mpp.getOrDefault(ch,0)+1);
        }
        PriorityQueue<Character> pq=new PriorityQueue<>(
            (ch1,ch2) -> mpp.get(ch2) - mpp.get(ch1)
        );
        for(char ch:mpp.keySet()){
            pq.add(ch);
        }
        String ans="";
        for(int i=0;i<s.length();i++){
            char ch=pq.poll();
            if(i==0 || ans.charAt(i-1)!=ch){
                ans+=ch;
                mpp.put(ch,mpp.get(ch)-1);
            }else{
                if(pq.isEmpty()){
                    return "";
                }
                char nextChar=pq.poll();
                ans+=nextChar;
                mpp.put(nextChar,mpp.get(nextChar)-1);
                if(mpp.get(nextChar)>0){
                pq.add(nextChar);
                }
            }
            if(mpp.get(ch)>0){
                pq.add(ch);
            }
        }
        return ans;
    }
}