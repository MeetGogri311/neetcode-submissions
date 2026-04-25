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
        ListNode fast = head, slow = head;
        while(fast != null && slow != null){
            if(fast.next != null){
                fast = fast.next.next;
            } else{
                return false;
            }
            slow = slow.next;
            if(fast == slow) return true;
        }
        return false;
    }
}
