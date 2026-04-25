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
    private int[] level;
    private TreeNode[] parent;
    private void populateLevelAndParent(TreeNode root, TreeNode p){
        if(root == null) return;
        level[root.val] = p == null? 1 : level[p.val] + 1;
        parent[root.val] = p;
        populateLevelAndParent(root.left, root);
        populateLevelAndParent(root.right, root);
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        level = new int[201];
        parent = new TreeNode[201];
        populateLevelAndParent(root, null);
        while(level[p.val] > level[q.val]){
            p = parent[p.val];
        }
        while(level[q.val] > level[p.val]){
            q = parent[q.val];
        }
        while(p.val != q.val){
            p = parent[p.val];
            q = parent[q.val];
        }
        return p;
    }
}
