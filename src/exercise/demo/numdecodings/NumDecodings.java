package exercise.demo.numdecodings;

import java.util.Arrays;
import java.util.List;

import javax.swing.JInternalFrame;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;

public class NumDecodings {
	public int numDecodings(String s) {
		return caculateNum(s,0);
		
	}
	private int caculateNum(String s,int index) {
		if(index > s.length()) {
			return 1;
		}
		if(s.charAt(index) == '0') {
			return 0;
		}
		int result1 = 0;
		int result2 = 0;
		result1 = caculateNum(s, index + 1);
		if((s.charAt(index) * 10 + s.charAt(index + 1)) < 26) {
			result2 = caculateNum(s, index + 2);
		}
		return result1 + result2;
		
	}
}
