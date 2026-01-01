class Solution {
    public int[] plusOne(int[] digits) {
        int len=digits.length;
        if(digits[digits.length-1]<9){
            digits[digits.length-1]++;
            return digits;
        }
        digits[len-1]=0;
        int c=1;
        for(int i=len-2;i>=0;i--){
            int now=digits[i]+c;
            if(now==10){
                digits[i]=0;
                c=1;
            }else{
                digits[i]=now;
                c=0;
                System.out.println("re");
                return digits;
            }
        }
                    int[] ans=new int[len+1];

        if(c==1){
            for(int i=0;i<len+1;i++){
                ans[i]=0;
            }
            ans[0]=1;

        }
        return ans;
    }
}