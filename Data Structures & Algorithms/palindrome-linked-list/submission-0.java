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
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head,fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode prev=null,curr=slow.next;
        while(curr!=null){
            ListNode next1= curr.next;
            curr.next=prev;
            prev=curr;
            curr=next1;
            
        }
        ListNode head1=prev;
        while(head != null && head1!=null){
            if(head.val!= head1.val){
                return false;
            }
            head=head.next;
            head1=head1.next;
        }
        return true;

    }
}