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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if (root == null)
            return new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        Map<TreeNode, Integer> map = new HashMap<>();
        q.add(root);
        map.put(root, 0);
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<>(Arrays.asList(root.val)));
        while (!q.isEmpty()) {
            if (q.peek().left != null) {
                if (ans.size() < map.get(q.peek()) + 2) {
                    ans.add(new ArrayList<>());
                }
                q.offer(q.peek().left);
                map.put(q.peek().left, map.get(q.peek()) + 1);
                ans.get(map.get(q.peek()) + 1).add(q.peek().left.val);
            }
            if (q.peek().right != null) {
                if (ans.size() < map.get(q.peek()) + 2) {
                    ans.add(new ArrayList<>());
                }
                q.offer(q.peek().right);
                map.put(q.peek().right, map.get(q.peek()) + 1);
                ans.get(map.get(q.peek()) + 1).add(q.peek().right.val);
            }
            q.poll();
        }
        Collections.reverse(ans);
        return ans;
    }
}