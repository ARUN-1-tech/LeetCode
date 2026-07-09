// Last updated: 7/9/2026, 10:08:31 AM
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
    int size(ListNode head) {
        ListNode node = head;
        int size = 0;
        while (node != null) {
            size++;
            node = node.next;
        }
        return size;
    }

    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        int count = size(head) / 2;
        ListNode previous = null;
        ListNode present = head;
        while (count-- > 0) {
            ListNode current = present;
            ListNode prev = null;
            ListNode nxt = current.next;
            for (int i = 0; i < 2; i++) {
                current.next = prev;
                prev = current;
                current = nxt;
                if (nxt != null) {
                    nxt = nxt.next;
                }
            }
            if (previous == null) {
                head = prev;
            } else {
                previous.next = prev;
            }
            previous = present;
            present = current;
        }
        previous.next = present;
        return head;
    }
}