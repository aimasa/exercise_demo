package exercise.demo.queue;

import java.util.ArrayList;
import java.util.List;

class MyCircularQueue {
	private int length;
	List<Integer> queQue; 
	int head;
	int deil;
	Boolean flag;

	/** Initialize your data structure here. Set the size of the queue to be k. */
	public MyCircularQueue(int k) {
		this.length = k;
		this.queQue = new ArrayList<Integer>();
		this.head = 0;
		this.deil = 0;
		this.flag = true;
	}

	/**
	 * Insert an element into the circular queue. Return true if the operation is
	 * successful.
	 */
	public boolean enQueue(int value) {
		if(isFull()) {
			return false;
		}
		if(head >deil ) {
			 queQue.set(deil, value);
			 deil++;
			 return true;
		}
		if(deil == length - 1 ){
			deil = 0;
			flag = false;
			return queQue.add(value);
		}
		deil++;
		return queQue.add(value);


	}

	/**
	 * Delete an element from the circular queue. Return true if the operation is
	 * successful.
	 */
	public boolean deQueue() {
		if(isEmpty()) {
			return false;
		}
		if(head == length - 1) {
			head = 0;
			flag = true;
			return true;
		}
		head++;
		return true;

	}

	/** Get the front item from the queue. */
	public int Front() {
		if(isEmpty()) {
			return -1;
		}

		return queQue.get(head);

	}

	/** Get the last item from the queue. */
	public int Rear() {
		if(isEmpty()) {
			return -1;
		}
        if(deil == 0){
            return queQue.get(length - 1);
        }
		return queQue.get(deil - 1);

	}

	/** Checks whether the circular queue is empty or not. */
	public boolean isEmpty() {
		if(head == deil && flag) {
			return true;
		}
		return false;

	}

	/** Checks whether the circular queue is full or not. */
	public boolean isFull() {
		if(deil == head && !flag) {
			return true;
		}
		return false;

	}
}