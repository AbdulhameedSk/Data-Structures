class Solution {
    public int removeDuplicates(int[] nums) {
        HashMap<Integer,Integer> mpp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            mpp.put(nums[i],mpp.getOrDefault(nums[i],0)+1);
        }
        int k=0;
        int index=0;
        for(int i=0;i<nums.length;i++){
            if(mpp.containsKey(nums[i])){
                nums[index++]=nums[i];
                mpp.remove(nums[i]);
                k++;
            }
        }
        return k;
    }
}