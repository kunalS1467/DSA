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
    public Pair lowestCommon(TreeNode root, TreeNode p, TreeNode q) {
         if(root==null){
             return new Pair();
         }
        Pair left=lowestCommon(root.left,p,q);
        Pair right=lowestCommon(root.right,p,q);
        Pair pres=new Pair();
        if(left.value!=null || right.value!=null){
            return (left.value!=null)?left:right;
        }
        else if((left.first && right.second) || (right.first && left.second)){
            pres.value=root;
            pres.first=true;
            pres.second=true;
           
        }
        else if(root.val==p.val){
            if(left.second || right.second){
                pres.second=true;
                pres.value=root;
            }
            pres.first=true;
        }
        else if(root.val==q.val){
            if(left.first || right.first){
                pres.first=true;
                pres.value=root;
            }
            pres.second=true;
        }
        else if(left.first || right.first){
            pres.first=true;
        }
        else if(left.second || right.second){
            pres.second=true;
        }
        return pres;
    }
}