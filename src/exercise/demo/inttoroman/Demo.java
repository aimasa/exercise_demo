package exercise.demo.inttoroman;

import java.util.*;

public class Demo {
public static void main(String[] args) throws InterruptedException {
// t.join()是让下面的线程等之前的t线程执行完才能继续start()执行
    System.out.println(Thread.currentThread().getName()+" start");
    ThreadTest threadTest1 = new ThreadTest("A");
    ThreadTest threadTest2 = new ThreadTest("B");
    ThreadTest threadTest3 = new ThreadTest("c");
    ThreadTest threadTest4 = new ThreadTest("D");

    threadTest1.start();

    threadTest2.start();
    threadTest1.join();

    threadTest3.start();

    threadTest4.start();

    System.out.println(Thread.currentThread().getName()+" end");
}
}

class ThreadTest extends Thread{
    private String name;
    public ThreadTest(String name){
        this.name = name;
    }
    public void run(){
        for(int i = 0; i < 5; i++){
            System.out.println(name + " : " + i);
        }
    }
}
