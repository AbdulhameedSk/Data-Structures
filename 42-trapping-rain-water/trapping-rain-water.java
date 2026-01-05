class Solution {
    public int trap(int[] height) {
        int l=height.length;
        if(l<=2) return 0;
        int[] lmax=new int[l];
        int[] rmax=new int[l];
        lmax[0]=height[0];
        for(int i=1;i<l;i++){
            lmax[i]=Math.max(lmax[i-1],height[i]);
        }
        rmax[l-1]=height[l-1];
        for(int i=l-2;i>=0;i--){
            rmax[i]=Math.max(height[i],rmax[i+1]);
        }
        int ans=0;
        for(int i=0;i<l;i++){
            ans+=Math.min(lmax[i],rmax[i])-height[i];
        }
        return ans;
    }
}