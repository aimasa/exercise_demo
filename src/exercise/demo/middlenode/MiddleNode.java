package exercise.demo.middlenode;

import exercise.demo.type.ListNode;

public class MiddleNode {
    public ListNode middleNode(ListNode head) {
        ListNode[] result = new ListNode[200];
        int index = 0;
        if(head == null){
            return head;
        }
        while(head != null){
            result[index] = head;
            head = head.next;
            index++;
        }
        if(index == 0){
            return head;
        }
        return result[index / 2];

    }
}
