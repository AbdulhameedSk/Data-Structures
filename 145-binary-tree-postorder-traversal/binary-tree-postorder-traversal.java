/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> al=new ArrayList<>();
        Stack<TreeNode> s=new Stack<>();
        if (root == null) return al;

        Stack<Integer> s2=new Stack<>();
        TreeNode t=root;
        s.push(t);
        while(!s.isEmpty()){
            t=s.pop();
            s2.push(t.val);
            if(t.left!=null){
                s.add(t.left);
            }
            if(t.right!=null){
                s.add(t.right);
            }
        }
while(!s2.isEmpty()){
    al.add(s2.pop());
}
        return al;
    }
}