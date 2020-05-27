package exercise.demo.addtwonumbers2;

import java.util.List;

import exercise.demo.type.ListNode;


public class Demo {
	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		ListNode a1 = new ListNode(2);
		ListNode a2 = new ListNode(3);
		ListNode a4 = new ListNode(5);
		ListNode a5 = new ListNode(8);
		ListNode l2 = new ListNode(6);
		ListNode b1 = new ListNode(7);
		ListNode b2 = new ListNode(8);
		ListNode b3 = new ListNode(10);
		l1.next = a1;
		a1.next = a2;
		a2.next = a4;
		l2.next = b1;
		b1.next = b2;
		b2.next = b3;
		new AddTwoNumbers().addTwoNumbers(l1, l2);

	}
}
