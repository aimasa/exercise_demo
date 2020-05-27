package exercise.demo.maxqueue;

import java.util.ArrayList;
import java.util.List;

public class MaxQueue {
	List<Integer> queQue;
	int head;
    int tail;
    int[] maxPoint;
	int maxHead;
	int maxTail;

	public MaxQueue() {
		queQue = new ArrayList<Integer>();
		head = 0;
		tail = 0;
		maxPoint = new int[20000];
		maxHead = 0;
		maxTail = 0;
	}

	public int max_value() {
		return head;
        

	}

	public void push_back(int value) {
		queQue.add(value);
		tail++;
		while(maxHead != maxTail && value > maxPoint[maxTail - 1]) {
			maxTail--;
		}
        maxPoint[maxTail++] = value;
	}

	public int pop_front() {
		if(head == tail) {
			return -1;
		}
		int temp = queQue.get(head);
		if(temp == maxPoint[maxHead]) {
			maxHead++;
		}
		head++;
		return temp;
		

	}
}
