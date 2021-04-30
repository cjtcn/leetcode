/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode fast = head; ListNode latter = head;
        for(int i = 0;i < k; i++){
            fast = fast.next;
        }
        while(fast != null){
            fast =fast.next;
            latter = latter.next;
        }
        return latter;        
    }
}