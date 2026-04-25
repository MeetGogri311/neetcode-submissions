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
    private int[] findMaxPath(TreeNode root){
        if(root==null) return new int[2];
        int[] result = new int[2], left, right;
        left = findMaxPath(root.left);
        right = findMaxPath(root.right);
        if(root.left == null){
            left[1] = root.val;
        }
        if(root.right == null){
            right[1] = root.val;
        }
        result[0] = Math.max(root.val, root.val+Math.max(left[0],right[0]));
        result[1] = Math.max(root.val+left[0]+right[0], Math.max(result[0], Math.max(left[1], right[1])));
        return result;
    }
    public int maxPathSum(TreeNode root) {
        return findMaxPath(root)[1];
    }
}
