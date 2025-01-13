class Solution {
    public int minimumLength(String s) {
        HashMap<Character,Integer> mpp=new HashMap<>();
        for(char c:s.toCharArray()){
            mpp.put(c,mpp.getOrDefault(c,0)+1);
        }
        for(char c:mpp.keySet()){
            if(mpp.get(c)%2==0){
                mpp.put(c,2);
            }
            else{
                mpp.put(c,1);
            }
        }
        int ans=0;
        for(char c:mpp.keySet()){
            ans+=mpp.get(c);
        }
        return ans;
    }
}