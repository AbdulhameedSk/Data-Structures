class Solution {
    public int removeDuplicates(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        int max=Integer.MAX_VALUE;

        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i+1);
        }int c=0;
        Arrays.fill(nums,max);
        for(int k:map.keySet()){
            nums[c]=k;   
            c++;
                }
                for(int k:map.keySet()){
            System.out.println(k);
                }
                Arrays.sort(nums);
        return c;
    }
}