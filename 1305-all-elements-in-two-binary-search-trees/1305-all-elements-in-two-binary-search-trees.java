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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> l=new ArrayList<>();
        dfs(l,root1);
        dfs(l,root2);
        Collections.sort(l);
        return l;
    }
    public void dfs(List<Integer> l,TreeNode root){
        if(root==null) return;
        l.add(root.val);
        dfs(l,root.left);
        dfs(l,root.right);
    }
}