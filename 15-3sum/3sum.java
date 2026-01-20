// class Solution {
//     public List<List<Integer>> threeSum(int[] nums) {
//         Arrays.sort(nums);

//         List<List<Integer>> ans= new ArrayList<>();
//         int len=nums.length;
        
//         for(int i=0;i<len-3;i++){
//             if((i>0)&&(nums[i]==nums[i-1])  ){
//                 continue;
//             }
//             int l=i+1;
//             int r=len-1;
//             int val=0-nums[i];
//             while(l<r){
//                 ArrayList<Integer> al=new ArrayList<>();
//                 if(nums[l]+nums[r]==val){
//                     al.add(nums[i]);
//                     al.add(nums[l]);
//                     al.add(nums[r]);
//                     ans.add(al);
//                     l++;
//                     r--;
//                 }else if(nums[l]+nums[r]<val){
//                     l++;
//                 }else{
//                     r--;
//                 }
//             }
//         }return ans;        
//     }
// }

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> al=new ArrayList<>();
        for(int i=0;i<nums.length-2;i++){
            if(i==0 || nums[i]!=nums[i-1]){
                int a=nums[i];
                TwoSum(nums,i+1,-a,al);
            }

        }
        return al;
        }
    
    public static void TwoSum(int[] nums,int ind,int target,List<List<Integer>> al){
        int i=ind;
        int j=nums.length-1;
        while(i<j){
            int a=nums[i];
            int b=nums[j];
            if(a+b==target){
                ArrayList<Integer> ans=new ArrayList<>();
                ans.add(-target);
                ans.add(a);
                ans.add(b);
                al.add(ans);
                i++;
            
                while(i<j && nums[i]==nums[i-1]){
                    i++;
                }                    j--;

                while(i<j && nums[j]==nums[j+1]){
                    j--;
                }
            }else if(a+b<target){
                i++;
            }else{
                j--;
            }
        }
    }    
}