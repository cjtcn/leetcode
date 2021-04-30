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
        LinkedList <TreeNode> stack1 = new LinkedList <>();
        LinkedList <TreeNode> stack2 = new LinkedList<>();
        List<List<Integer>> list = new ArrayList<>();  // 一个List 存储类型是List 这个List存储类型是Integer
        if(root == null) return list;
        stack1.add(root);
        int count = 0;
        while(!stack1.isEmpty() || !stack2.isEmpty()){
            List <Integer> ans = new LinkedList<Integer>();
            if(!stack1.isEmpty()){
                
                for(int i = stack1.size();i > 0;i--){
                    TreeNode node = stack1.removeLast();
                    ans.add(node.val);
                    if(node.left != null) stack2.add(node.left);
                    if(node.right != null) stack2.add(node.right);
                }        
                
            }
            else if(!stack2.isEmpty()){
                
                for(int i = stack2.size();i > 0;i--){
                    
                    TreeNode node = stack2.removeLast();
                    ans.add(node.val);
                    if(node.right != null) stack1.add(node.right);
                    if(node.left != null) stack1.add(node.left);
                }        
                
            }
            list.add(ans);

            
            

        }
        return list;
    }
}