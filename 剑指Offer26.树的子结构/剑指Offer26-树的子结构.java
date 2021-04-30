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
        // ���A B����һ��Ϊ�� ��false��
        if(B == null || A == null) return false;
        // �ж� B�ǲ���A������ || B�ǲ���A������������ || B�ǲ���A������������
        return recur(A,B) || isSubStructure(A.left,B) || isSubStructure(A.right,B);

    }
    boolean recur(TreeNode A, TreeNode B){ // �ж�B�ǲ���A������
        if(B == null) return true; //B����ƥ���� ��Bȷʵ������
        if(A == null || A.val != B.val) return false; // B���� ��A�ǿյ� ����ֵ����� �ǾͲ��������� 
        return recur(A.left,B.left) && recur(A.right,B.right); // �ݹ���������������
    }
}