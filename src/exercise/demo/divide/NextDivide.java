package exercise.demo.divide;

public class NextDivide {
	public int divide(int dividend, int divisor) {
    	int flag = 1;
    	if(dividend == 0)return 0;
    	if(divisor ==1)return dividend;
    	if(dividend < 0) {
    		if(dividend > Integer.MIN_VALUE) {
    			dividend = Math.abs(dividend);
    		}
    		else {
				dividend = Integer.MAX_VALUE;
			}
    		flag = -flag;
    	}
    	if(divisor < 0) {
    		if(divisor > Integer.MIN_VALUE) {
    			divisor = Math.abs(divisor);
    		}
    		else {
    			divisor = Integer.MAX_VALUE;
			}
    		flag = -flag;
    	}

    	int doubleStepNum = 0;
    	int doubleDivisor = 0;
    	int stepNum = 0;
    	while(doubleDivisor < dividend) {
    		if(dividend -  (divisor << (doubleStepNum + 1)) < 0) {
    			if(dividend - doubleDivisor - divisor < 0) {
    				break;
    			}
    			stepNum += 1;
    			doubleDivisor = doubleDivisor + divisor;

    			continue;
    		}
    		doubleStepNum = doubleStepNum + 1;
    		doubleDivisor = divisor << doubleStepNum;
    	}
    	try {
    		int result = doubleStepNum==0?stepNum : (1<<doubleStepNum) + stepNum;
    		return flag == -1?-(result): result;
		} catch (Exception e) {
			return Integer.MAX_VALUE;
		}
    	
	}
}
