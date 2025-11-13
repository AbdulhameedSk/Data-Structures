class Solution {
    public int maxArea(int[] height) {
        int maxi=0,l=0,r=height.length-1;
        while(l<=r){
            int area=(r-l)*(Math.min(height[l],height[r]));
            maxi=Math.max(maxi,area);
            if(height[l]>height[r]){
                r--;
            }else{
                l++;
            }
        }
        return maxi;
    }
}