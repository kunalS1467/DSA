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
    public void flatten(TreeNode root) {
        flat(root);
    }
    public TreeNode flat(TreeNode root) {
        if(root==null)return null;
        TreeNode l = flat(root.left);
        root.left = null;
        TreeNode r = flat(root.right);
        if(l==null){
            root.right = r;
        }else{
            root.right =l;
            TreeNode temp = l;
            while(temp.right!=null){
                temp = temp.right;
            }
            temp.right = r;
        }
        return root;
    }
}