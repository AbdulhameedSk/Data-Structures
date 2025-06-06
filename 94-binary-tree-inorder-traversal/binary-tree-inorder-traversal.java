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
    ArrayList<Integer> al=new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        in(root);
        return al;
    }
    public void in(TreeNode root){
        if(root==null){
            return;
        }
        in(root.left);
        al.add(root.val);
        in(root.right);
    }
}