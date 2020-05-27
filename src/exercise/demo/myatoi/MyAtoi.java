package exercise.demo.myatoi;

public class MyAtoi {
    public int myAtoi(String str) {
    	char[] charStr = str.toCharArray();
    	int index = 0;
    	Boolean flag = true;
    	while(index < charStr.length && charStr[index] == ' ') {
    		index++;
    	}
    	if(charStr[index] == '-') {
    		flag = false;
    		index++;
    	}
    	if(charStr[index] == '+') {
    		index++;
    	}
    	int ans = 0;
    	for(int i = index; i < charStr.length; i++) {
    		if(charStr[i] < 48 || charStr[i] > 57) {
    			break;
    		}
    		int dig = charStr[i] - '0';
    		if((Integer.MAX_VALUE - dig)/10 < ans) {
    			return flag? Integer.MAX_VALUE: Integer.MIN_VALUE;
    		}
    		ans = ans * 10 + dig;
    	}

    	
    	return flag?ans: ans*(-1);
        
    }
}
