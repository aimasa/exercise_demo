package exercise.demo.divide;

import java.util.zip.Inflater;

public class Divide {
	public int divide(int dividend, int divisor) {
		int flag = 1;
		if (dividend == 0)
			return 0;
		if (divisor == 1)
			return dividend;
		if (dividend < 0) {
			if (dividend > Integer.MIN_VALUE) {
				dividend = Math.abs(dividend);
			} else {
				dividend = Integer.MAX_VALUE + 1;
			}
			flag = -flag;
		}
		if (divisor < 0) {
			if (divisor > Integer.MIN_VALUE) {
				divisor = Math.abs(divisor);
			} else {
				divisor = Integer.MAX_VALUE + 1;
			}
			flag = -flag;
		}

		int doubleStepNum = 0;
		int doubleDivisor = 0;
		int stepNum = 0;
//    	while(doubleDivisor < dividend) {
//    		if(dividend -  (divisor << (doubleStepNum + 1)) < 0) {
//    			if(dividend - doubleDivisor - divisor < 0) {
//    				break;
//    			}
//    			stepNum += 1;
//    			doubleDivisor = doubleDivisor + divisor<<stepNum;
//
//    			continue;
//    		}
//    		doubleStepNum = doubleStepNum + 1;
//    		doubleDivisor = divisor << doubleStepNum;
//    	}

		try {
			int result = div(dividend, divisor, 0);
			return flag == -1 ? -(result) : result;
		} catch (Exception e) {
			return flag == -1 ? Integer.MIN_VALUE : Integer.MAX_VALUE;
		}

	}

	public int div(int dividend, int divisor,int result) {
    	if(dividend < divisor) {
    		return result;
    		}
    	int temp = divisor;
    	int j = 0;
    	while (divisor < dividend) {
			int i = 1 << j;
			dividend = dividend - temp;
			temp = temp <<1;
			result += i;
			j++;
		}

		return div(dividend,divisor,result);
    	
    }
}
