class Solution {
    public String shiftingLetters(String s, int[][] shifts) {
        int[] diffArray=new int[s.length()];
        for(int[] shift:shifts){
            if(shift[2]==1){
                diffArray[shift[0]]++;
                if(shift[1]+1<diffArray.length){
                    diffArray[shift[1]+1]--;
                }
            }else{
                if(shift[2]==0){
                    diffArray[shift[0]]--;
                }
                if(shift[1]+1<diffArray.length){
                    diffArray[shift[1]+1]++;
                }
            }
        }
        StringBuilder result=new StringBuilder(s);
        int numberOfShifts=0;
        for(int i=0;i<s.length();i++){
            numberOfShifts=(numberOfShifts+diffArray[i])%26;
                        if(numberOfShifts<0){
                numberOfShifts+=26;
            }
            char shiftedChar=(char)('a'+((s.charAt(i)-'a'+numberOfShifts)%26));

            result.setCharAt(i,shiftedChar);
        }
        return result.toString();
    }
}