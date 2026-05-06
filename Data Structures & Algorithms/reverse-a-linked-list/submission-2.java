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
    public ListNode reverseList(ListNode head) {
        ListNode p =null;
        ListNode next =null;
        ListNode cur =null;
        while(head !=null){
            next = head.next;
            head.next = p;
            p= head;
            head = next;
        }
        return p;
    }
}
