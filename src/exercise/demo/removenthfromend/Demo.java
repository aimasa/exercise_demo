package exercise.demo.removenthfromend;

import exercise.demo.type.ListNode;

public class Demo {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(5);
        listNode.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        RemoveNthFromEnd rnf = new RemoveNthFromEnd();
        System.out.println(rnf.removeNthFromEnd(listNode, 2));
    }
}
