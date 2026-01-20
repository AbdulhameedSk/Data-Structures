class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> ans= new ArrayList<>();
        int len=nums.length;
        
        for(int i=0;i<len-2;i++){
            if((i>0)&&(nums[i]==nums[i-1])  ){
                continue;
            }
            int l=i+1;
            int r=len-1;
            int val=0-nums[i];
            while(l<r){
                ArrayList<Integer> al=new ArrayList<>();
                if(nums[l]+nums[r]==val){
                    al.add(nums[i]);
                    al.add(nums[l]);
                    al.add(nums[r]);
                    ans.add(al);
                    l++;
                    r--;
                    while(l<r && nums[l]==nums[l-1]){
                        l++;
                    }
                    while(r>l && nums[r]==nums[r+1]){
                        r--;
                    }
                }else if(nums[l]+nums[r]<val){
                    l++;
                }else{
                    r--;
                }
            }
        }return ans;        
    }
}
