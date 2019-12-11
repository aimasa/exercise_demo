package exercise.demo.swappairs;

import exercise.demo.type.ListNode;

public class Demo {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        ListNode listNode2 = new ListNode(4);
        ListNode listNode3 = new ListNode(5);
        ListNode listNode4 = new ListNode(3);
        listNode.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        SwapPairs swapPairs = new SwapPairs();
        swapPairs.swapPairs(listNode);
    }
}
