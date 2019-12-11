package exercise.demo.mergetwolists;

import exercise.demo.type.ListNode;

public class MergeTwoLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode resultListNode = new ListNode(0);
        ListNode temp = resultListNode;
        while (l1 != null && l2 != null) {
            if (l1.val > l2.val) {
                temp.next = l2;
                l2 = l2.next;
            } else {
                temp.next = l1;
                l1 = l1.next;
            }
            temp = temp.next;
        }
        if(l1 != null) {
            temp.next = l1;
        }else {
            temp.next = l2;
        }
        return resultListNode.next;
    }
}
