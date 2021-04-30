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
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        // 如果A B中有一个为空 则false；
        if(B == null || A == null) return false;
        // 判断 B是不是A的子树 || B是不是A左子树的子树 || B是不是A右子树的子树
        return recur(A,B) || isSubStructure(A.left,B) || isSubStructure(A.right,B);

    }
    boolean recur(TreeNode A, TreeNode B){ // 判断B是不是A的子树
        if(B == null) return true; //B都被匹配了 那B确实是子树
        if(A == null || A.val != B.val) return false; // B不空 但A是空的 或者值不相等 那就不是子树了 
        return recur(A.left,B.left) && recur(A.right,B.right); // 递归左子树和右子树
    }
}