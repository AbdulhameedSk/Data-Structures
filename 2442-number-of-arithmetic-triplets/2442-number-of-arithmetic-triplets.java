class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int count=0;
        Set<Integer> set=new HashSet<>();
        for(int i:nums){
          set.add(i);
        }
        for(int num:nums){
          if(set.contains(num+diff) && set.contains(num+diff+diff)){
            count++;
          }
        }
        return count;
    }
}