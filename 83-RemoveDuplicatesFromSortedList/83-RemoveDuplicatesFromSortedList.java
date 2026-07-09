// Last updated: 7/9/2026, 10:07:18 AM
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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode abc=head;
        while(abc != null && abc.next!=null){
            if(abc.val==abc.next.val) abc.next=abc.next.next;
            else abc=abc.next;
        }
        return head;
    }
}