class Solution {
    public int findPairs(int[] nums, int k) {
        int c=0;
        Set<String> s=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(Math.abs(nums[i]-nums[j])==k){
                    s.add(Math.min(nums[i],nums[j])+","+Math.max(nums[i],nums[j]));
                }
            }
        }
        return s.size();
    }
}