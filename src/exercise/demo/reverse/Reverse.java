package exercise.demo.reverse;

public class Reverse {
	public int reverse(int x) {
		int reverseNum = 0;
		reverseNum = x < 0 ? (-1) * reverseNum : reverseNum;
		while (x != 0) {
			int pop = x % 10;
			x = x / 10;
			if(reverseNum > Integer.MAX_VALUE/10 || (reverseNum == Integer.MAX_VALUE/10 && pop > 7)) {return 0;}
			if(reverseNum < Integer.MIN_VALUE/10 || (reverseNum == Integer.MIN_VALUE/10 && pop < -8)) {return 0;}
			reverseNum = reverseNum * 10 + pop;
		}
		return reverseNum;

	}
}
