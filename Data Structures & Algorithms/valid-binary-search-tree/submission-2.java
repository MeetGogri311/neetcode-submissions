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
    class Node{
        public int max, min;
        public boolean isValid;
        Node(int val){
            max = val;
            min = val;
            isValid = true;
        }
    }
    private Node checkBST(TreeNode root){
        Node result = new Node(root.val);
        if(root.left!=null){
            Node left = checkBST(root.left);
            result.isValid = result.isValid && left.isValid && left.max < root.val;
            result.min = left.min;
        }
        if(root.right!=null){
            Node right = checkBST(root.right);
            result.isValid = result.isValid && right.isValid && right.min > root.val;
            result.max = right.max;
        }
        return result;
    }
    public boolean isValidBST(TreeNode root) {
        return checkBST(root).isValid;
    }
}
