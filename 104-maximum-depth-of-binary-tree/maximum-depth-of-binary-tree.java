class Solution {
    public int maxDepth(TreeNode root) {int ans=0;
        if(root!=null){
        return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
        
        }
        return ans;
    }
}