package exercise.demo.test;

public class test implements Runnable{
	public void test(){
		System.out.println("--------------------------------String-------------------------------");
		long time = System.currentTimeMillis();
		String aString = "abc";
		for (int i = 0; i < 100000; i++) {
			aString = aString + "第" + i + "個bcd";
		}
		System.out.println(System.currentTimeMillis() - time);
		aString = null;

		System.out.println("--------------------------------StringBuffer-------------------------------");
		long time2 = System.currentTimeMillis();
		StringBuffer stringBuffer = new StringBuffer("12");
		for (int i = 0; i < 100000; i++) {
			stringBuffer.append("第" + i + "個bcd");
		}
		System.out.println(System.currentTimeMillis() - time2);
		stringBuffer = null;

		System.out.println("--------------------------------stringBuilder-------------------------------");
		long time3 = System.currentTimeMillis();
		StringBuilder stringBuilder = new StringBuilder("12");
		for (int i = 0; i < 100000; i++) {
			stringBuilder.append("第" + i + "個bcd");
		}
		System.out.println(System.currentTimeMillis() - time3);
		stringBuilder = null;
	}

	int count = 0;

	public synchronized void run() {
		for (int i = 0; i < 5; i++) {
			try {
				System.out.println(Thread.currentThread().getName() + ":" + (count++));
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
