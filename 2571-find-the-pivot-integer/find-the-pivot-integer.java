class Solution {
    public static int sum(int a,int b){
        int s=0;
        for(int i=a;i<=b;i++){
            s+=i;
        }
        return s;
    }
    public int pivotInteger(int n) {
        if(n==1){
            return 1;
        }
        for(int i=1;i<n;i++){
            if(sum(1,i)==sum(i,n)){
                return i;
            }
        }
        return -1;
    }
}