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
    public boolean hasCycle(ListNode head) {
        ArrayList<Integer> nums= new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            if(!nums.contains(temp.val)){
                nums.add(temp.val);
                
            }else{
                return true;
            }
            temp=temp.next;
            
        }
        return false;
    }
}
