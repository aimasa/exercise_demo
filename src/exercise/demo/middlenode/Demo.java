package exercise.demo.middlenode;

import exercise.demo.longestpalindrome.newLongestPalindrome;
import exercise.demo.type.ListNode;

public class Demo {
public static void main(String[] args) {
	ListNode listNode1 = new ListNode(1);
	ListNode listNode2 = new ListNode(2);
	ListNode listNode3 = new ListNode(3);
	listNode1.next = listNode2;
	listNode2.next = listNode3;
	new MiddleNode().middleNode(listNode1);
}
}
