class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int r=0,l=0,ans=0,rem=0,maxT = 0,maxF = 0,len=0;
        for(;r<answerKey.length();r++){
        if (answerKey.charAt(r) == 'T') {
                maxT++;
            } else {
                maxF++;
            }
            rem=Math.min(maxT,maxF);
            
        for(;rem>k && l<=r;l++){
              if (answerKey.charAt(l) == 'T') {
                    maxT--;
                } else {
                    maxF--;
                }
                rem=Math.min(maxT,maxF);
            }
if(rem<=k){
        ans=Math.max(ans,r-l+1);
        }}
         return ans;
    }
}