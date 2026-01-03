class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st=new Stack<>();
        int l=nums.length;
        int[] ans =new int[l];
        Arrays.fill(ans,-1);
        for(int i=2*l-1;i>=0;i--){
            int idx=i%l;
            while(!st.isEmpty() && st.peek()<=nums[idx]){
                st.pop();
            }
            int val=st.isEmpty()?-1:st.peek();
            ans[idx]=val;
            st.push(nums[idx]);
        }
        return ans;
    }
}