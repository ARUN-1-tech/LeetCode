// Last updated: 7/9/2026, 10:08:33 AM
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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length==0) return null;
        return divide(lists,0,lists.length-1);
    }
    public ListNode divide(ListNode[] lists,int l,int r){
        if(l==r) return lists[l];
        int m=(l+r)/2;
        ListNode a=divide(lists,l,m);
        ListNode b=divide(lists,m+1,r);
        return merge(a,b);
    }
    public ListNode merge(ListNode a,ListNode b){
        if(a==null) return b;
        if(b==null) return a;
        if(a.val<b.val){
            a.next=merge(a.next,b);
            return a;
        }
        else{
            b.next=merge(a,b.next);
            return b;
        }
    }
}