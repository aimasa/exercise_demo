package exercise.demo.test;

public class Animal {
    int num = 1;
    int arg = 0;
    static int age = 20;
    public Animal(){
        System.out.println("I am animal");
    }
    public void eat(){
        System.out.println("动物吃饭");
    }

    public static void sleep(){
        System.out.println("动物在睡觉");
    }
    public void run(){
        System.out.println("动物在奔跑");
    }
}
