package exercise_demo_addtwonumbers;
/**
 * 
 * @author aimasa
 *
 */
public class AddTwoNumbers {
	/**
	 * 
	 * @param l1������l1�������ʾһ���Ǹ�������2 -> 4 -> 3==342
	 * @param l2������l2�������ʾһ���Ǹ�������2 -> 4 -> 3==342
	 * @return ���ǽ��������������������᷵��һ���µ���������ʾ���ǵĺ͡�
	 */
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//		ListNode tempListNodel1;//�õ����Ȱ��������������ݷֱ���ϳ���������������ӣ��ٰѽ��װ���������棬����û�п���������һ��Ϊ�յ������
//		ListNode tempListNodel2;
//		int numl1 = 0;
//		int numl2 = 0;
//		tempListNodel1 = l1;
//		tempListNodel2 = l2;
//		for (int i = 1; tempListNodel1 != null || tempListNodel2 != null; i = i * 10) {
//			if (tempListNodel1 != null) {
//				numl1 = tempListNodel1.val * i + numl1;
//				tempListNodel1 = tempListNodel1.next;
//			}
//			if (tempListNodel2 != null) {
//				numl2 = tempListNodel2.val * i + numl2;
//				tempListNodel2 = tempListNodel2.next;
//			}
//		}
//		int num = numl1 + numl2;
//		int i = 10;
//		ListNode newListNode1 = new ListNode(0);
//		ListNode tempNewListNode = newListNode1;
//		int quot = num;
//		while (quot != 0) {
//			tempNewListNode.next= new ListNode(quot % i);
//			 tempNewListNode = tempNewListNode.next;
//			quot = quot / i;
//		}
//		for (int t = 0; t < index - 1; t++) {
//			ListNodelist.get(t).next = ListNodelist.get(t+1);
//		}
//		newListNode1 = ListNodelist.get(0);
//		return newListNode1.next;
		ListNode newListNode1 = new ListNode(0);//����ֱ�Ӷ������е�һ���ַ�һ���ַ���Ӧ����ӣ������������ö���ӵ������ж��Ƿ�Ϊ�գ���ֹ���ֿ�ָ���쳣��
		ListNode curr = newListNode1;
		ListNode tmpL1 = l1;
		ListNode tmpL2 = l2;
		int carry = 0;
		for (; tmpL1 != null || tmpL2 != null;) {
			int p = (tmpL1 == null) ? 0 : tmpL1.val;
			int q = (tmpL2 == null) ? 0 : tmpL2.val;
			int sum = carry + p + q;
			carry = sum / 10;
			curr.next = new ListNode(sum % 10);
			curr = curr.next;

			tmpL1 = (tmpL1 == null) ? null : (tmpL1.next == null) ? null : tmpL1.next;
			tmpL2 = (tmpL2 == null) ? null : (tmpL2.next == null) ? null : tmpL2.next;
		}

		if (carry > 0) {
			curr.next = new ListNode(carry);
		}
		return newListNode1.next;
	}
}
