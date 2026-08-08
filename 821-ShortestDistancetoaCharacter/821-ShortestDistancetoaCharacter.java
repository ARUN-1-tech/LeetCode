// Last updated: 8/8/2026, 12:11:00 PM
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
12    public ListNode partition(ListNode head, int x) {
13        ListNode before=new ListNode(0);
14        ListNode after=new ListNode(0);
15        ListNode b=before;
16        ListNode a=after;
17        ListNode cur=head;
18        while(cur!=null){
19            if(cur.val<x){
20                b.next=cur;
21                b=b.next;
22            }else{
23                a.next=cur;
24                a=a.next;
25            }
26            cur=cur.next;
27        }
28        a.next=null;
29        b.next=after.next;
30        return before.next;
31    }
32}