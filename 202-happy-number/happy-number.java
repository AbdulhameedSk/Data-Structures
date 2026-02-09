class Solution {
    public boolean isHappy(int n) {
        int temp=n;
        // if(n<9 && n>1) return false;
        HashSet<Integer> s=new HashSet<>();
        s.add(n);
        while(temp!=1){
            temp=sqsum(temp);
            if(s.contains(temp)){
                return false;
            }
            s.add(temp);
        }
        return true;
    }
    public static int sqsum(int temp){
        int t=temp,ans=0;
        while(t>0){
            int rem=t%10;
            ans+=rem*rem;
            t/=10;
        }
        return ans;
    }
}