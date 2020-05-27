package exercise.demo.mergeklists;

import exercise.demo.type.ListNode;

public class reMergeKLists extends MergeKLists{
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) {
            return null;
        }
        if (lists.length == 1) {
            return lists[0];
        }
        int length = 0;
        for(int i = 0; i < lists.length; i++){
            length += countLenth(lists[i]);

        }
        ListNode head = new ListNode(0);
        ListNode temp = head;

        int min = Integer.MAX_VALUE;
        int tempIdex = 0;
        for (int j = 0; j < length; j++){
            for (int i = 0; i < lists.length; i++) {
                if (lists[i] == null) {
                    continue;
                }
                if (lists[i].val <= min) {
                    tempIdex = i;
                    min = lists[i].val;
                }
            }
            min = Integer.MAX_VALUE;
        temp.next = lists[tempIdex];
        temp = temp.next;
        lists[tempIdex] = lists[tempIdex].next;
    }
        return head.next;
    }
    public int countLenth(ListNode listNode){
        if(listNode == null){
            return 0;
        }
        return countLenth(listNode.next) + 1;
    }
}
