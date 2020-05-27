package exercise.demo.mergeklists;

import exercise.demo.type.ListNode;

public class Demo {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        ListNode listNode2 = new ListNode(4);
        ListNode listNode3 = new ListNode(5);
        ListNode listNode7 = new ListNode(1);
        ListNode listNode4 = new ListNode(3);
        ListNode listNode5 = new ListNode(2);
        ListNode listNode6 = new ListNode(6);
        ListNode listNode8 = new ListNode(4);

//        listNode.next = listNode2;
//        listNode2.next = listNode3;
//
//        listNode7.next = listNode4;
//        listNode4.next = listNode8;
//
//        listNode5.next = listNode6;
        ListNode listNode9 = new ListNode(-1);

        MergeKLists mergeKLists = new Re2MergeKLists();
        ListNode[] array = { listNode, listNode7, listNode5 };

        ListNode[] array1 = {};
        ListNode[] array2 = {listNode5,new ListNode(0).next,listNode9};
//        System.out.println(mergeKLists.mergeKLists(array));
//        System.out.println(mergeKLists.mergeKLists(array1));
        System.out.println(mergeKLists.mergeKLists(array2));
    }
}
