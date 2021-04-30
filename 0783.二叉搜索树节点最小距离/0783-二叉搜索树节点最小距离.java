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
    int res;
    int pre;
    public int minDiffInBST(TreeNode root) {
        res = Integer.MAX_VALUE;
        pre = -1;
        dfs(root);
        return res;
    }

    public void dfs(TreeNode root){
        if(root == null) return;
        dfs(root.left);
        
        if(pre == -1){
            pre = root.val;
        }else{
            res = Math.min(root.val - pre , res);
            pre = root.val;
        }
        dfs(root.right);
    }
}