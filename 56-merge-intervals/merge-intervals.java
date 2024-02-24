class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length<=1){
            return intervals;
        }
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        List<int[]> ans=new ArrayList<>();
        int[] now=intervals[0];
        ans.add(now);
        for(int[] interval:intervals){
            if(interval[0]<=now[1]){
                now[1]=Math.max(now[1],interval[1]);
            }
            else{
                now=interval;
                ans.add(now);
            }
        }
        return ans.toArray(new int[ans.size()][]);
    }
}