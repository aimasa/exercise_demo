package exercise.demo.mergeklists;

import exercise.demo.type.ListNode;

public class Re2MergeKLists extends reMergeKLists{
    public ListNode mergeKLists(ListNode[] lists) {
        for(int i = 1; i < lists.length; i++) {
            lists[i] = merge2Lists(lists[i - 1], lists[i]);
        }
        return lists[lists.length - 1];
    }
    public ListNode merge2Lists(ListNode l1, ListNode l2){
        ListNode head = new ListNode(0);
        ListNode temp = head;
        while(l1 != null || l2 != null){
            if(l1 == null){
                temp.next = l2;
                break;
            }
            if(l2 == null){
                temp.next = l1;
                break;
            }
            if(l1.val >= l2.val){
                temp.next = l2;
                l2 = l2.next;

            }
            else {
                temp.next = l1;
                l1 = l1.next;
            }
            temp = temp.next;
        }
        return head.next;
    }
}
