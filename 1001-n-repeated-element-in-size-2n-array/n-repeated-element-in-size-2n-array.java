class Solution {
    public int repeatedNTimes(int[] nums) {
        HashMap<Integer,Integer> mpp=new HashMap<>();
        for(int i:nums){
            mpp.put(i,mpp.getOrDefault(i,0)+1);
        }
        for(int i:mpp.keySet()){
            if(mpp.get(i)==(nums.length/2)){
                return i;
            }
        }
        return -1;
    }
}