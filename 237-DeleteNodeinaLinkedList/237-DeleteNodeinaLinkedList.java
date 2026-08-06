// Last updated: 8/6/2026, 2:28:08 PM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public void reorderList(ListNode head) {
13        ListNode slow = head, fast = head;
14        while (fast != null && fast.next != null) {
15            slow = slow.next;
16            fast = fast.next.next;
17        }
18        ListNode pre = null;
19        while (slow != null) {
20            ListNode temp = slow.next;
21            slow.next = pre;
22            pre = slow;
23            slow = temp;
24        }
25        ListNode first = head;
26        ListNode second = pre;
27        while (second.next != null) {
28            ListNode temp1 = first.next;
29            ListNode temp2 = second.next;
30
31            first.next = second;
32            second.next = temp1;
33
34            first = temp1;
35            second = temp2;
36        }
37    }
38}