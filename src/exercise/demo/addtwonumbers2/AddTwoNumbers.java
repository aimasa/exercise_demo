package exercise.demo.addtwonumbers2;

import java.util.LinkedList;
import java.util.Stack;

import exercise.demo.intersection.intersection;
import exercise.demo.type.ListNode;

public class AddTwoNumbers {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//	        int l1Length = length(l1);
//	        int l2Length = length(l2);
//	        int l1Left = l2Length > l1Length ? 0 : (l1Length - l2Length);
//	        int l2Left = l2Length < l1Length ? 0 : (l1Length - l2Length);
//	        int right = 0;
//	        ListNode result = new ListNode(0);
		int right = 0;
		Stack<Integer> listNodeVal1 = new Stack<Integer>();
		while (l1 != null) {
			listNodeVal1.push(l1.val);
			l1 = l1.next;
		}
		Stack<Integer> listNodeVal2 = new Stack<Integer>();
		while (l2 != null) {
			listNodeVal2.push(l2.val);
			l2 = l2.next;
		}
		int count = 0;
		ListNode result = null;
		while (!listNodeVal1.isEmpty() || !listNodeVal2.isEmpty()) {

               int a = listNodeVal1.isEmpty()?listNodeVal1.pop():0;
               int b = listNodeVal2.isEmpty()?listNodeVal2.pop():0;

			int sum = a + b + count;
			ListNode nextResult = new ListNode(sum % 10);
			count = sum / 10;
			nextResult.next = result;
            result = nextResult;
		}
	
		return result;


	}

//	    public int length(ListNode l){
//	        if(l == null && ){
//	            return 1;
//	        }
//	        int result = length(l.next) + 1;
//	        return result;
//
//	    }
}
