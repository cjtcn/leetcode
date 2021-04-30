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
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        Queue <TreeNode> queue = new LinkedList <>();
        List<List<Integer>> list = new ArrayList<>();  // 一个List 存储类型是List 这个List存储类型是Integer
        if(root == null) return list;
        queue.offer(root);
        while(!queue.isEmpty()){
            List <Integer> ans = new LinkedList<Integer>();
            for(int i = queue.size();i > 0;i--){
                TreeNode node = queue.poll();
                ans.add(node.val);
                if(node.left != null) queue.offer(node.left);
                if(node.right != null) queue.offer(node.right);
                
            }
            list.add(ans);
            

        }
        return list;
    }
}