class Solution {
    public int countPairs(List<Integer> nums, int target) {
        Collections.sort(nums);
        int c=0;
        int left=0;
        int right=nums.size()-1;
        if(left==right){
            return -1;
        }
        while(left<right){
            int sum=nums.get(left)+nums.get(right);
            if(sum<target){
                c+=right-left;
                left++;
            }
             else{
                right--;
            }
           
        }
        return c;
    }
}