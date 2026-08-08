// Last updated: 8/8/2026, 12:20:44 PM
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
13        Queue<Integer> q1=new LinkedList<>();
14        Queue<Integer> q2=new LinkedList<>();
15        ListNode p=head;
16        while(p!=null){
17            if(p.val<x) q1.add(p.val);
18            else q2.add(p.val);
19            p=p.next;
20        }
21        p=head;
22        while(!q1.isEmpty()){
23            p.val=q1.poll();
24            p=p.next;
25        }
26        while(!q2.isEmpty()){
27            p.val=q2.poll();
28            p=p.next;
29        }
30        return head;
31    }
32}