package exercise.demo.maxarea;


public class Demo {
public static void main(String[] args) {
	MaxArea maxArea = new MaxArea1();
	int[] test = new int[]{14,0,12,3,8,3,13,5,14,8};

	
	System.out.println(maxArea.maxArea(test));
}
}
