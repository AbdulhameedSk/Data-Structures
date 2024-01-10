/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public static int count(ListNode head){
            int c=0;
            ListNode t=head;
            while(t!=null){
                c++;
                t=t.next;
            }
            if(c%2==0){
                return (c/2)+1;
            }
            return (c+1)/2;
        }

    public ListNode deleteMiddle(ListNode head) {
        ListNode temp = head;
        int mid = count(head);
        System.out.println(mid);
        if(temp.next==null){
            return null;
        }
        if (temp.next.next==null) {
            head.next = null;
            return head;
        }
        if(head==null){
            return null;
        }
        int counter = mid;
        if(mid==0){
            return null;
        }
        while (counter-2  != 0) {
            temp = temp.next;
            counter--;
        }
        System.out.println(counter);
        temp.next = temp.next.next;
        return head;
    }
}