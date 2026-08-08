// Last updated: 8/8/2026, 12:16:23 PM
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
    public ListNode partition(ListNode head, int x) {
        ListNode p = head;
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        //segregating the elements according to the given value;
        while(p!=null){
            if(p.val<x){
                q1.add(p.val);
            }
            else{
                q2.add(p.val);
            }
            p=p.next;
        }
        
        //putting the elements back
        p = head;
        while(!q1.isEmpty()){
            p.val = q1.poll();
            p=p.next;
        }
        while(!q2.isEmpty()){
            p.val = q2.poll();
            p=p.next;
        }
        return head;
    }
}