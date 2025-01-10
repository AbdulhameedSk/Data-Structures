class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        int[] bmax=new int[26];
        for(String s:words2){
            int[] bcount=count(s);
            for(int i=0;i<26;i++){
                bmax[i]=Math.max(bmax[i],bcount[i]);
            }
        }
        ArrayList<String> al=new ArrayList<>();
        search : for(String s:words1){
            int[] acount=count(s);
            for(int i=0;i<26;i++){
                if(acount[i]<bmax[i]){
                    continue search ;
                }
            }
                                al.add(s);

        }
        return al;
    }
    public int[] count(String s){
        int[] arr=new int[26];
        for(char c:s.toCharArray()){
            arr[c-'a']++;
        }
        return arr;
    }
}