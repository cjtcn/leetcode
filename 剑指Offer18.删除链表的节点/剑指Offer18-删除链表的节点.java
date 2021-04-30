/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteNode(ListNode head, int val) {
        ListNode l = head;
        if(head.val == val){
            return head.next;
        }
        while(l.next != null && l.next.val != val){
            l = l.next;
        }
        l.next = l.next.next;
        return head;
    }
}