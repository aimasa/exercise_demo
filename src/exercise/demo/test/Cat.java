package exercise.demo.test;

public class Cat extends Animal{
    int arg = 12;
//    private static int age = 1;
    public Cat(){
        System.out.println("i am cat");
    }
    public void eat(){
        System.out.println("猫喜欢吃肉");
    }
    public static void sleep(){
        System.out.println("猫在睡觉");
    }
}
