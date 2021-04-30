/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode insertionSortList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode lastSorted = head;
        ListNode curr = head.next;
        while(curr != null){
            if(curr.val >= lastSorted.val) lastSorted = lastSorted.next;
            else{
                ListNode pre = dummy;
                while(pre.next.val < curr.val){
                    pre = pre.next;
                }
                lastSorted.next = curr.next;
                curr.next = pre.next;
                pre.next = curr;
                
            }curr = lastSorted.next;
        }
        return dummy.next;
    }
}