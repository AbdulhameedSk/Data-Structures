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
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> al=new ArrayList<>();
        Stack<TreeNode> s=new Stack<TreeNode>();
        TreeNode t=root;
        if(root==null){
            return al;
        }
        s.push(t);
        while(!s.isEmpty()){
            t=s.pop();
            al.add(t.val);
            if(t.right!=null){
                s.add(t.right);
            }
            if(t.left!=null){
                s.add(t.left);
            }
        }
        return al;
    }
}