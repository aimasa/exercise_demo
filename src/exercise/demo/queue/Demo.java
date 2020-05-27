package exercise.demo.queue;

public class Demo {
public static void main(String[] args) {
	MyCircularQueue circularQueue = new MyCircularQueue(2); // 设置长度为 3

	circularQueue.enQueue(8	);  // 返回 true

	circularQueue.enQueue(8);  // 返回 true


	circularQueue.Rear();  // 返回 3

	circularQueue.isFull();  // 返回 true
	circularQueue.deQueue();  
	circularQueue.enQueue(1);
	circularQueue.enQueue(1);

	circularQueue.Rear();  // 返回 4
    System.out.print("1");
}
}
