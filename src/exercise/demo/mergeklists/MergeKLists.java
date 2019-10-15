package exercise.demo.mergeklists;

import exercise.demo.type.ListNode;

public class MergeKLists {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode startListNode = lists.length > 0 ? lists[0] : new ListNode(0).next;
        ListNode headNode = new ListNode(0);
        ListNode tempListNode = headNode;
        
        for (int i = 1; i < lists.length; i++) {
            ListNode listNode = lists[i];
            while (listNode != null && startListNode != null) {
                if (listNode.val > startListNode.val) {
                    headNode.next = startListNode;
                    startListNode = startListNode.next;
                } else {
                    headNode.next = listNode;
                    listNode = listNode.next;
                }
                headNode = headNode.next;
            }
            if (startListNode == null) {
                headNode.next = listNode;
            }
            if (listNode == null) {
                headNode.next = startListNode;
            }
            startListNode = tempListNode.next;
            
            headNode = new ListNode(0);
            tempListNode = headNode;
            
        }
        return startListNode;
    }
    

}
