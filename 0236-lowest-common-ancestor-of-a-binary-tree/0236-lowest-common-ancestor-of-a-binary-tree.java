/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Pair{
    TreeNode value;
    boolean first;
    boolean second;
}
public class Solution {
    public TreeNode lowestCommonAncestor(TreeNode curr, TreeNode p, TreeNode q) {
        
        if(curr==null){
            return null;
        }
        
        if(curr.val==p.val || curr.val==q.val){
            return curr;
        }

        TreeNode left = lowestCommonAncestor(curr.left, p, q);
        TreeNode right = lowestCommonAncestor(curr.right, p, q);
        
        if(left==null && right==null){
            return null;
        }
        if(left!=null && right==null){
            return left;
        }
        if(left==null && right!=null){
            return right;
        }
            return curr;
        
    }
}