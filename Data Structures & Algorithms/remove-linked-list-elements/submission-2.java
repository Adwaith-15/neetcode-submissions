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
    public ListNode removeElements(ListNode head, int val) {
        ListNode temp=head;
        ListNode prev=head;
        while(temp!= null){
            if(temp.val == val){
                if(temp.next == null){
                    head= null;
                    break;
                }
                if(head.val==val){
                    head=head.next;
                }
                else{
                    prev.next=temp.next;
                    prev=prev.next;
                }
                temp=temp.next;
            }
            temp=temp.next;
            prev=prev.next;
        }
        return head;
    }
}