package exercise.demo.maxarea;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo {
public static void main(String[] args) {
	MaxArea maxArea = new MaxArea();
	int[] test = new int[]{1,8,6,2,5,4,8,3,7};

	
	System.out.println(maxArea.maxArea(test));
}
}
