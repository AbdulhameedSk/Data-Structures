class Solution {
    public boolean isPowerOfTwo(int n) {
        String bin=Integer.toBinaryString(n);
        // if(bin.charAt(bin.length()-1)=='1'){
        //     return false;
        // }
        if(n<=0)return false;
        int c=0;
        for(int i=bin.length()-1;i>=0;i--){
            if(bin.charAt(i)=='1'){
                c++;
            }
            if(c==2){
                return false;
            }
        }
        return true;
    }
}