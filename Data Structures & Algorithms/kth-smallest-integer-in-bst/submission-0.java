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
    class kSmallest{
        int k;
        kSmallest(int k){
            this.k = k;
        }
        public int kthSmallest(TreeNode root){
            if(root == null) return 0;
            int result = kthSmallest(root.left);
            if(k == 0) return result;
            k--;
            if(k == 0) return root.val;
            result = kthSmallest(root.right);
            if(k == 0) return result;
            return root.val;
        }
    }
    public int kthSmallest(TreeNode root, int k) {
        return new kSmallest(k).kthSmallest(root);
    }
}
