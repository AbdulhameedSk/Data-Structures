class Solution {
    public int[] minOperations(String boxes) {
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < boxes.length(); i++) {
            if (boxes.charAt(i) == '1') {
                al.add(i); 
            }
        }
        int[] ans = new int[boxes.length()];
        for (int i = 0; i < boxes.length(); i++) {
            int shifts = 0;
            for (int j = 0; j < al.size(); j++) {
                
                shifts += Math.abs(i - al.get(j));
            }
            // if(boxes.charAt(i)=='1'){
                ans[i] = shifts; 

            // }
        }
        return ans;
    }
}
