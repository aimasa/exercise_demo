package exercise.demo.removenthfromend;

import exercise.demo.type.ListNode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class RemoveNthFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode nextListNode = new ListNode(0);
        nextListNode.next = head;
        ListNode first = head;
        int preIndex = 0;
        int index = 0;
        ListNode resultListNode = nextListNode;
        while(first != null) {
            if(preIndex > n) {
                index = index + 1;
                resultListNode = resultListNode.next;
            }
            preIndex = preIndex + 1;
            first = first.next;
        }
        resultListNode.next = resultListNode.next.next; 
//        first = nextListNode;
//        while (index - n > 0) {
//            first = first.next;
//            index = index - 1;
//        }
//        first.next = first.next.next;
        
        return nextListNode.next;
        
    }

    
}
