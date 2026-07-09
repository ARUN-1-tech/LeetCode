// Last updated: 7/9/2026, 10:05:43 AM
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
    public ListNode removeElements(ListNode head, int val) {
        while(head != null && head.val == val) {
            head = head.next;
        }
        ListNode abc=head;
        while(abc != null && abc.next!=null){
            if(abc.next.val==val) abc.next=abc.next.next;
            else abc=abc.next;
        }
        return head;
    }
}