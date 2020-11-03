package exercise.demo.test;

abstract class A{
    public abstract void print();

    //内部抽象类子类
    private static class B extends A{
        //覆写抽象类的方法
        public void print(){
            System.out.println("Hello World !");
        }
    }

    //这个方法不受实例化对象的控制
    public static A getInstance(){
        return new B();
    }

    public static void main(String[] args) {
        //此时取得抽象类对象的时候完全不需要知道B类这个子类的存在
        A a = A.getInstance();
        a.print();
    }
}
