package exercise.demo.oddevenlist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

import exercise.demo.type.ListNode;

public class OddEvenList {
    public ListNode oddEvenList(ListNode head) {
        ListNode nodeOdd = head;
        ListNode nodeTemp = head.next;
        while (nodeTemp != null && nodeTemp.next != null) {
                ListNode temp = nodeTemp.next;
                ListNode node = nodeOdd.next;
                nodeOdd.next = temp;
                nodeTemp.next = temp.next;
                temp.next = node;
                nodeOdd = nodeOdd.next;
                nodeTemp = nodeTemp.next;
        }
        return head;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String strInt = br.readLine();
        ListNode head = new ListNode(0);
        ListNode temp = head;
        while (!strInt.equals("")) {
            ListNode listNode = new ListNode(Integer.valueOf(strInt));
            temp.next = listNode;
            temp = temp.next;
            strInt = br.readLine();
        }
        ListNode result = new OddEvenList().oddEvenList(head.next);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }
}
