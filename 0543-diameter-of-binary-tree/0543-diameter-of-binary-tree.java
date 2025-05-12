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
class Pair{
    int height;
    int diameter;
}
class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        return diameter(root).diameter;
    }
    public Pair diameter(TreeNode root) {
        if(root==null)return new Pair();
        Pair left=diameter(root.left);
        Pair right=diameter(root.right);

        Pair res=new Pair();
        res.height=1+Math.max(left.height,right.height);
        res.diameter=Math.max(left.height+right.height,Math.max(left.diameter,right.diameter));

        return res;
    }
}