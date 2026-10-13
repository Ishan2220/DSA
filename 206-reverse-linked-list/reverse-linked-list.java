
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next==null){
            return head;
        }
        ListNode prev = head;
        ListNode curr = head.next;
        ListNode agla = curr;
        prev.next = null;
        while(agla!=null){
            agla = curr.next;
            curr.next = prev;
            prev = curr;
            
            curr = agla;
            
        }
        return prev;
    }
}