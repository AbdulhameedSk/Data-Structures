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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp=head;
        int c=0;
        while(temp!=null){
            c++;
            temp=temp.next;
        }
        if(c==1 && head.next==null){
            return null;
        }
        if(c==2 && n==1 && head.next.next==null){
            head.next=null;
            return head;
        }
        if(c==2 && n==2 && head.next.next==null){
            head=head.next;
            return head;
        }
        //Now c have size of array
        c=c-n;
        temp=head;
        if(c==0){
            return head.next;
        }
        //cth node is node before which we have to delete
        while(c!=1){
            c--;
            temp=temp.next;
        }
        ListNode lavda=temp;
        lavda=lavda.next.next;
        temp.next=lavda;
        return head;
    }
}