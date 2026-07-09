// Last updated: 7/9/2026, 10:06:07 AM
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode cur1=headA;
        ListNode cur2=headB;
        while(cur1 != cur2){
            cur1 = cur1!=null? cur1.next : headB;
            cur2 = cur2!=null? cur2.next : headA;
        }
        return cur1;
    }
}