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
        List<Integer> values = new ArrayList<>();
        preorderTraversal(root, values);
        return values;
    }
    public void preorderTraversal(TreeNode root, List<Integer> values) {
        // base condition
        if(root==null)return;
        values.add(root.val);
        // left
        preorderTraversal(root.left, values);
        // right
        preorderTraversal(root.right, values);
        // no return 
    }
    // basecondition
    // operation
    // return
}