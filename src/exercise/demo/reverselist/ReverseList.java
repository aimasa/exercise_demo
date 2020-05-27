package exercise.demo.reverselist;

import exercise.demo.type.ListNode;

public class ReverseList {
    public ListNode reverseList(ListNode head) {
//    	if(head == null || head.next == null) {
//    		return head;
//    	}
//    	ListNode headPoint = reverseList(head.next);
//        head.next.next = head;
//    	head.next = null;
//
//		return headPoint;
    	ListNode tempPre = head;
    	ListNode temptail = head.next;
    	ListNode pre = null;
    	while (temptail != null) {
    		ListNode temp = temptail.next;
			temptail.next = tempPre;
			tempPre.next = pre;
			pre = tempPre;
			tempPre = temptail;
			temptail = temp;
		}

    	
    	
		return tempPre;
        
    }
}
