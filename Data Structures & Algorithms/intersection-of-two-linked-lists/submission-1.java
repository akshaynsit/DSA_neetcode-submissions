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
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode first =headA;
        ListNode second  =headB;
        int m = 0;
        int n = 0;
        while(first!= null){
            m++;
            first =first.next;
        }
        first =headA;
        while(second!= null){
            n++;
            second =second.next;
        }
        second =headB;
        if(m>n){
            for(int i=0;i<m-n;i++){
                first = first.next;
            }
        }
        else{
          for(int i=0;i<n-m;i++){
                second = second.next;
            }  
        }
        while(first!=null && second !=null){
            if(first == second) return first;
            first = first.next;
            second =second.next;
        }
        return null;
    }
}