class Solution {
    public int maxArea(int[] height) {
        int max=0,area=0,l=0,r=height.length-1;
        while(l<r){
            int min=Math.min(height[l],height[r]);
            area=min*(r-l);
            max=Math.max(area,max);
            if(height[l]<height[r]){
                l++;
            }else{
                r--;
            }
        }
        return max;
    }
}