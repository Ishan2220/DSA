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
        int size1 = 0;
        int size2 = 0;
        ListNode temp1 = headA;
        ListNode temp2 = headB;

        while(temp1 != null){
            temp1 = temp1.next;
            size1++;
        }

        while(temp2 != null){
            temp2 = temp2.next;
            size2++;
        }
        int m;
        if(size1>size2){
            m = size1-size2;
            temp1=headA;
            temp2=headB;
        }
        else{
            m = size2-size1;
            temp1=headB;
            temp2=headA;

        }
        for(int i=0;i<m;i++){
            temp1=temp1.next;
        }
        while(temp1!=temp2){
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        

    return temp1;
    }
}