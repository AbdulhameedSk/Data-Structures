class Solution {
    public int sumFourDivisors(int[] nums) {
        int ans=0;
        for(int i :nums){
            int val=sumdiv(i);
            System.out.println(val);
            if(val!=-1){
                ans+=val;
            }
        }
        return ans;
    }
    public static int sumdiv(int n){
        int c=0;
        int sum=0;
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                c++;
                sum+=i;
                if(i!=n/i){
                    c++;
                    sum+=n/i;
                }
                if(c>4) return -1;
            }
        }
        if (c == 2) return sum + 1 + n;
        return -1;
    }
}