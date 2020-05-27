package exercise.demo.mystack;

import java.util.LinkedList;
import java.util.Queue;

class MyStack {
	Queue<Integer> queue;
	Queue<Integer> queue2;
	int top;

    /** Initialize your data structure here. */
    public MyStack() {
    	queue = new LinkedList<Integer>();
    	queue2 = new LinkedList<Integer>();
    	top = 0;

    }
    
    /** Push element x onto stack. */
    public void push(int x) {
    	if(queue.size() == 0) {
    		top = x;
    	}
    	queue.offer(x);

    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
    	while (queue.size() > 1) {
            queue2.offer(queue.remove());			
		}
    	Queue<Integer> temp = queue2;
    	queue2 = queue;
    	queue = temp;
    	return queue2.remove();

    }
    
    public int top() {
    	return top;

    }
    
    public boolean empty() {
    	if(queue.size() == 0) {
    		return true;
    	}
    	return false;

    }
}

