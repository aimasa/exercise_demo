package exercise.demo.divide;

public class Demo {
    public static void main(String[] args) {
		Divide divide = new Divide();
		System.out.println(divide.divide(-2147483648,2));
		NextDivide nextDivide = new NextDivide();
		System.out.println(nextDivide.divide(-2147483648, 2));
	}
}
