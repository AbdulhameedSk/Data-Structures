class Solution {
    public int[][] merge(int[][] intervals) {
        // Arrays.sort(intervals);
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        // int[] arr=new int[2];
        ArrayList<int[]> al=new ArrayList<>();
        al.add(intervals[0]);
        for(int i=1;i<intervals.length;i++){
            int l=al.size();
            if((al.get(al.size()-1)[1])<intervals[i][0]){
                al.add(intervals[i]);
            }else{
                al.get(al.size()-1)[1]=Math.max((al.get(al.size()-1)[1]),intervals[i][1]);
            }
        }
        // int[][] ans=new int[al.size()][2];
        // for(int i=0;i<al.size();i++){
        //     ans[i]=al.get(i);
        // }
        return al.toArray(new int[al.size()][2]);
    }
}