class Solution {
    public int maxProfit(int[] prices) {
        int l=0,r=1,p=0,maxp=0;
        while(r<prices.length){
            if(prices[l]<prices[r]){
                p=prices[r]-prices[l];
                maxp=Math.max(p,maxp);
            }
            else{
                l=r;
            }
            r++;
        }
        return maxp;
    }
}