package exercise_demo_addtwonumbers;


public class Demo {
	public static void main(String[] args) {
		ListNode headListNode1 = new ListNode(0);
		ListNode headListNode2 = new ListNode(3);
		ListNode headListNode3 = new ListNode(4);
//		headListNode1.next = headListNode2;
//		headListNode2.next = headListNode3;
		headListNode3.next = null;
		ListNode headListNodel1 = new ListNode(4);
		ListNode headListNodel2 = new ListNode(7);
		ListNode headListNodel3 = new ListNode(9);
		headListNodel1.next = headListNodel2;
		headListNodel2.next = headListNodel3;
		headListNodel3.next = null;
		AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        addTwoNumbers.addTwoNumbers(headListNode1, headListNodel1);
	}

}
