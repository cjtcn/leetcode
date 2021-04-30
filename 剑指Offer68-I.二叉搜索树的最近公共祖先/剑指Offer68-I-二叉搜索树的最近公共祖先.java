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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        List <TreeNode> p_ground = new ArrayList<>();
        List <TreeNode> q_ground = new ArrayList<>();
        p_ground = getPath(root,p);
        q_ground = getPath(root,q);
        TreeNode res = null;
        for(int i =0; i < p_ground.size() && i < q_ground.size();i++){
            if(p_ground.get(i) == q_ground.get(i)){
                res = p_ground.get(i);
            }else{
                break;
            }
        }
        return res;  
      
    }
    public List<TreeNode> getPath(TreeNode root, TreeNode p){
        List<TreeNode> res = new ArrayList<>();
        
        while(root.val != p.val) {
            res.add(root);  
            if(root.val > p.val){
                root = root.left;
                
            }else if(root.val < p.val){
                root = root.right;
            }    
            
        }res.add(root);
        return res;
    }
}