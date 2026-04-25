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
    private boolean checkSubtree(TreeNode root, TreeNode sroot){
        if(root == null && sroot == null) return true;
        if(root == null || sroot == null) return false;
        return (
            root.val == sroot.val && 
            checkSubtree(root.left, sroot.left) &&
            checkSubtree(root.right, sroot.right)
        );
    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        return checkSubtree(root, subRoot) || (root!=null && (isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot)));
    }
}
