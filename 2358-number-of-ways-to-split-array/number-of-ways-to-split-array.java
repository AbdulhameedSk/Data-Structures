class Solution {
    public int waysToSplitArray(int[] nums) {
        long[] r=new long[nums.length];
        long[] l=new long[nums.length];
        long sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            l[i]=sum;
            // System.out.println(l[i]);
        }
        // System.out.println();
        sum=0;
        for(int i=nums.length-1;i>=0;i--){
            sum+=nums[i];
            r[i]=sum;
            // System.out.println(r[i]);
        }
        int ans=0;
        for(int i=0;i<nums.length-1;i++){
            if(l[i]>=r[i+1]){
                ans++;
            }
        }
        return ans;
    }
}