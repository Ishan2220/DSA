
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null){
            return list2;
        }
        if(list2==null){
            return list1;
        }
        ListNode t1 = list1;
        ListNode t2 = list2;
        ListNode h = new ListNode(100);
        ListNode t = h;

        while(t1!=null && t2!=null){
            if(t1.val>=t2.val){
                t.next = t2;
                t = t2;
                t2 = t2.next;
            }
            else if(t1.val<t2.val){
                t.next = t1;
                t = t1;
                t1 = t1.next;
            }

        }

        if(t1==null && t2!=null) t.next = t2;
        else if(t2==null&&t1!=null)t.next=t1;
        return h.next;
    }
}