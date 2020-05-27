package exercise.demo.countandsay;

import java.util.Stack;

public class NewCountAndSay extends CountAndSay{
public String countAndSay(int n) {

	String dp = new String();
	dp = "1";
	for (int i = 1; i < n; i++) {
		int point = 0;
		char initChar = dp.charAt(0);
		String tempString = "";
		int count = 0;
		while (point < dp.length()) {
			if(dp.charAt(point) == initChar) {
				count++;
				point++;
			}
			else if(dp.charAt(point) != initChar) {
				tempString += Integer.toString(count) + initChar;
				count = 1;
				initChar = dp.charAt(point);
				point++;
			}
		}
		if(count != 0) {
			tempString += Integer.toString(count) + initChar;
		}
		
		dp = tempString;
	}
	return dp;


}
}
