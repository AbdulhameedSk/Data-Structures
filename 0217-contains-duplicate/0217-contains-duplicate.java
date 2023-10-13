class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i:nums){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }
        for(int i:mp.keySet()){
            if(mp.get(i)>1){
                return true;
            }
        }
        return false;
    }
}