package exercise.demo.reverselist;

import exercise.demo.type.ListNode;

public class Demo {
public static void main(String[] args) {
	ReverseList reverseList = new ReverseList();
	ListNode head = new ListNode(1);
	ListNode head2 = new ListNode(2);
	ListNode head3 = new ListNode(3);
	head.next = head2;
	head2.next = head3;
	reverseList.reverseList(head);
}
}
