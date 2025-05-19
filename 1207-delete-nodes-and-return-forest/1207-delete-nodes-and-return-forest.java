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
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        Set<Integer> set = new HashSet<>();
        for(int num : to_delete){
            set.add(num);
        }
        List<TreeNode> result = new ArrayList<>();
        TreeNode r = dfs(root,set,result);
        if(r!=null && !set.contains(r.val)){
            result.add(r);
        }
        return result;
    }
    public TreeNode dfs(TreeNode root, Set<Integer> set, List<TreeNode> result){
        if(root==null)return null;
        root.left = dfs(root.left,set,result);
        root.right = dfs(root.right,set,result);
        if(set.contains(root.val)){
            if(root.left!=null){
                result.add(root.left);
            }
            if(root.right!=null){
                result.add(root.right);
            }
            return null;
        }
        return root;
    }
}