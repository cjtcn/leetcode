/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val,Node _left,Node _right) {
        val = _val;
        left = _left;
        right = _right;
    }
};
*/
class Solution {
    Node head,pre; //成员变量
    public Node treeToDoublyList(Node root) {
        if(root == null) return null;
        dfs(root);
        head.left = pre;
        pre.right = head;
        return head;
    }
    public void dfs(Node curr){
        if(curr == null) return;
        dfs(curr.left);
        if(pre == null) head = curr;
        else pre.right = curr;
        curr.left = pre;
        pre = curr;
        dfs(curr.right);
    }
}