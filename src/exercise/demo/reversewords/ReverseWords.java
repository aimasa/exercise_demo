package exercise.demo.reversewords;

import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class ReverseWords {
	public String reverseWords(String s) {
		char[] charStr = s.toCharArray();
		List<String> temp = new ArrayList<String>();
		int left = 0;
		for (int i = 0; i < charStr.length; i++) {
			while (i < charStr.length && charStr[i] == ' ') {
				i++;
			}
			left = i;
			while (i < charStr.length && charStr[i] != ' ') {
				i++;
			}
			if (left == i) {
				break;
			}
			temp.add(s.substring(left, i));

		}
		Collections.reverse(temp);
		return String.join(" ", temp);
	}
}
