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
    public void reorderList(ListNode head) {
        //split
        // if(head==null || head.next==null || head.next.next==null){
        //     return null;
        // }
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode b=slow.next;
        ListNode a=head;
        slow.next=null;
        //Reverse
        ListNode prev=null;
        ListNode now=b;
        while(now!=null){
            ListNode nxt=now.next;
            now.next=prev;
            prev=now;
            now=nxt;
        }
        b=prev;
        //Combining
        ListNode dummy=new ListNode(0);
        ListNode temp=dummy;
        while(a!=null && b!=null){
            ListNode nxt=a.next;
            temp.next=a;
            temp=temp.next;
            a=nxt;

            ListNode nxt2=b.next;
            temp.next=b;
            temp=temp.next;
            temp.next=null;
            b=nxt2;
        }
        if(a!=null){
            temp.next=a;
        }
        if(b!=null){
            temp.next=b;
        }
        temp=head;
        ListNode temp2=dummy.next;
        while(temp!=null){
            temp.val=temp2.val;
            temp=temp.next;
            temp2=temp2.next;
        }
    }
}