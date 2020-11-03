package exercise.demo.sortlist;

import exercise.demo.type.ListNode;

public class SortList {
    public ListNode sortList(ListNode head) {
        ListNode partHead = split(head);
        ListNode resultNode = subSort(head, partHead);
        return resultNode;
    }
    public ListNode subSort(ListNode head1, ListNode head2){
        if(head1.next == null || head2.next == null){
            return merge(head1, head2);
        }
        ListNode secondPartHead1 = split(head1);
        ListNode secondPartHead2 = split(head2);
        ListNode partHead1 = subSort(head1, secondPartHead1);
        ListNode partHead2 = subSort(head2, secondPartHead2);
        return merge(partHead1, partHead2);
    }
    public ListNode split(ListNode head){
        ListNode firstPartHead = head;
        ListNode secondPartHead = head;
        ListNode tmp = firstPartHead;
        while(secondPartHead != null || secondPartHead.next != null){
            tmp = firstPartHead;
            firstPartHead = firstPartHead.next;
            secondPartHead = secondPartHead.next.next;
        }
        tmp.next = null;
        return firstPartHead;
    }
    public ListNode merge(ListNode l1, ListNode l2){
        ListNode head = new ListNode(0);
        String str = "";
        ListNode tmp = head;
        while(l1 != null || l2 != null){
            if(l1 == null){
                tmp.next = l2;
            }
            if(l2 == null){
                tmp.next = l1;
            }
            if(l1.val >= l2.val){
                tmp.next = l2;
                l2 = l2.next;
            }else{
                tmp.next = l1;
                l1 = l1.next;
            }
            tmp = tmp.next;
        }
        return head.next;
    }

    public static void main(String[] args) {

    }
}