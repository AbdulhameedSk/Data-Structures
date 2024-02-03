/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public static int sized(ListNode h1){
        ListNode t1=h1;
        int s1=0;
        while(t1!=null){
            s1++;
            t1=t1.next;
        }
        return s1;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int sa=sized(headA),sb=sized(headB);
        int d=Math.abs(sa-sb);
        ListNode t1=headA,t2=headB;
        while(d!=0){
            if(sa>sb){
                t1=t1.next;
                d--;
            }
            if(sa<sb){
                t2=t2.next;
                d--;
            }
        }
        while(t1!=t2){
            if(t1==null || t2==null){
                return null;
            }
            t1=t1.next;
            t2=t2.next;
        }
        return t1;
    }
}