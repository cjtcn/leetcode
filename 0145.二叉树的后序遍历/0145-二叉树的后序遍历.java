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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        postorder(root,res);
        return res;
    }
    public void postorder(TreeNode root, List<Integer> res) { // 不需要返回值 postorder当前root的值
        if(root == null) return;
        postorder(root.left,res);
        postorder(root.right,res);
        res.add(root.val);
    }
}