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
    public TreeNode invertTree(TreeNode root) {
        if(root==null)return null;
        invert(root);
        return root;
    }
    public TreeNode invert(TreeNode root) {
        if(root==null)return root;
        if(root.left==null && root.right==null)return root;
        TreeNode temp = root.right;
        root.right = invert(root.left);
        root.left = invert(temp);
        return root;
    }
}