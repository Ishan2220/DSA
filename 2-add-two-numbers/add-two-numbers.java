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
        if(l1==null && l2 ==null){
            return null;
        }
        if(l1==null){
            return l2;
        }
        if(l2==null){
            return l1;
        }
        ListNode temp1 = l1;
        ListNode temp2 = l2;
        int sum=0;
        int carry = 0;
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        while (temp1 != null || temp2 != null || carry != 0) {
            int t1 = (temp1 != null) ? temp1.val : 0;
            int t2 = (temp2 != null) ? temp2.val : 0;

            sum = t1 + t2 + carry;
            carry = sum / 10;

            curr.next = new ListNode(sum % 10);
            curr = curr.next;

            if (temp1 != null) temp1 = temp1.next;
            if (temp2 != null) temp2 = temp2.next;
        }
        return dummy.next;
    }
}