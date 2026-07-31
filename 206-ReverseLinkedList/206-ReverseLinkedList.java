// Last updated: 7/31/2026, 10:02:13 AM
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
12    public ListNode mergeTwoLists(ListNode head1, ListNode head2) {
13        ListNode t1=head1;
14        ListNode t2=head2;
15        ListNode dummy = new ListNode(-1);
16        ListNode ans = dummy;
17        while(t1!=null && t2!=null){
18            if(t1.val<=t2.val){
19                ans.next=t1;
20                t1=t1.next;
21            }else{
22                ans.next=t2;
23                t2=t2.next;
24            } 
25            ans=ans.next;
26        }
27        if (t1 != null) {
28            ans.next = t1;
29        } else {
30            ans.next = t2;
31        }
32        return dummy.next;
33    }
34}