class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> mpp=new HashMap<>();
        for(int i:nums){
            mpp.put(i,mpp.getOrDefault(i,0)+1);
        }
        ArrayList<Integer> al=new ArrayList<>();
        for(int i:mpp.keySet()){
            if(mpp.get(i)>n/3){
                al.add(i);
            }
        }
        return al;
    }
}