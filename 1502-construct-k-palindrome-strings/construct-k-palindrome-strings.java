class Solution {
    public boolean canConstruct(String s, int k) {
        HashMap<Character,Integer> mpp=new HashMap<>();
        if(k>s.length()){
            return false;
        }
        for(char c:s.toCharArray()){
            mpp.put(c,mpp.getOrDefault(c,0)+1);
        }
        int count=0;
        for(char c:mpp.keySet()){
            if(mpp.get(c)%2!=0){
                count++;
            }

        }

        return count<=k;
    }
}