class Solution {
    public int pivotInteger(int n) {
        int p=(int)Math.sqrt(n*(n+1)/2);
        if(p*p==n*(n+1)/2){
            return p;
        }
        return -1;
    }
}