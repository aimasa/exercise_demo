package exercise.demo.reversekgroup;

import exercise.demo.type.ListNode;

public class ReverseKGroup {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode preHead = new ListNode(0);
        ListNode pre = new ListNode(0);
        ListNode corr = new ListNode(0);
        preHead.next = corr;
        pre.next = head;
        int index = 0;
        while (head != null) {
            head = head.next;
            index = index + 1;
        }
        int num = index / k;
        ListNode first = pre.next;
        corr.next = first;
        for (int j = 0; j < num; j++) {
            ListNode end = first.next;
            ListNode second = first;
            for (int i = 0; i < k - 1; i++) {
                ListNode tempListNode = end.next;
                second.next = tempListNode;
                end.next = first;
                first = end;
                end = second.next;
                corr.next = first;
            }
            for(int t = 0; t < k ; t++) {
                corr = corr.next;
            }
            if (end == null) {
                break;
            }
            first = end;
        }
        return preHead.next.next;
    }

}
