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
        int n =0;
        int m =0;
        int forward =0;
        ListNode A = headA;
        ListNode B =headB;
        while(A!=null){
            n+=1;
            A = A.next;
        }
        while(B!=null){
            m+=1;
            B = B.next;
        }
        if(m>n){
            A = headA;
            B =headB;
            forward = m-n;
        }
        else{
            A = headB;
            B =headA;
            forward = n-m;
        }
        for(int i=0;i<forward;i++){
            B=B.next;
        }
        while(A!=null && B!=null){
            if(A==B) return A;
            A=A.next;
            B=B.next;
        }
        return null;

        

    }
}