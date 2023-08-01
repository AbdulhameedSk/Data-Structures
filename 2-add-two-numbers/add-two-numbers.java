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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        var head = new ListNode();
        //For creating new ListNode
        var temp=head;
        int sum=0;
        int carry=0;
        // Loop through both input lists or until carry is non-zero
        while(l1!=null || l2!=null || carry!=0){
            sum=0;
            // Add the value of the current nodes from l1 and l2, if available
            if(l1!=null){
                sum=sum+l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                sum=sum+l2.val;
                l2=l2.next;
            }
            //Add carry every time to sum
            sum+=carry;
            //Carry can be created dividing with 10
            carry=sum/10;
             // Create a new ListNode for the current digit and add it to the result list
            var node=new ListNode(sum%10);
            temp.next=node;
            temp=temp.next;

        }
        return head.next; // Return the head.next because head is a dummy node
    }
    }