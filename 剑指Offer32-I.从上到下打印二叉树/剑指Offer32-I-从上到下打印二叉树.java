/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int[] levelOrder(TreeNode root) {
       if(root == null) return new int[0];
       Queue <TreeNode> queue = new LinkedList <TreeNode>();
       ArrayList <Integer> ans = new ArrayList<Integer>();
       queue.offer(root);
       while(!queue.isEmpty()){
           TreeNode node = queue.poll();
           ans.add(node.val);
           if(node.left != null) queue.offer(node.left);
           if(node.right != null) queue.offer(node.right);
       }
       int[] res = new int[(ans.size())];
       for(int i = 0; i < ans.size(); i++){
           res[i] = ans.get(i);
       }return res;  
    }
}