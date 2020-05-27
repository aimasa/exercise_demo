package exercise.demo.addbinary;

import java.util.LinkedList;
import java.util.Stack;

public class AddBinary {
	public String addBinary(String a, String b) { 
		int leftA = a.length() - 1;
		int leftB = b.length() - 1;
		int bia = 0;
		StringBuilder result = new StringBuilder();
		while (leftA >= 0 || leftB >= 0) {
			int sum = bia;
			sum += leftA < 0 ? 0 : a.charAt(leftA) - '0';
			sum += leftB < 0 ? 0 : b.charAt(leftB) - '0';
			result.append(sum % 2);
			bia = sum / 2;
			leftA--;
			leftB--;
		}
		if (bia == 1) {
			result.append(bia);
		}
		return result.reverse().toString();

	}
}
