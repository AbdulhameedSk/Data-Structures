class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> s=new HashSet<>();
        ArrayList<Integer> a2=new ArrayList<>();
        for(int i:nums2){
            a2.add(i);
        }
        for(int i:nums1){
            if(a2.contains(i)){
                s.add(i);
            }
        }
        int index=0;
        int[] ans=new int[s.size()];
        for(int i:s){
            ans[index++]=i;
        }
        return ans;
        }
    }