package exercise.demo.numdecodings;

public class DpNumDecodings extends NumDecodings{
	public int numDecodings(String s) {
		char[] aList = s.toCharArray();
		if (aList.length == 0 || aList[0] == '0') {
			return 0;
		}
		int[] pd = new int[aList.length];
		pd[0] = 1;
		if (aList[1] == '0') {
			if (aList[0] == '1' || aList[0] == '2') {

				pd[1] = 1;
			} else {
				return 0;
			}
		} else {
			pd[1] = (aList[0] - '0') * 10 + (aList[1] - '0') <= 26 ? 2 : 1;
		}
		for (int i = 2; i < aList.length; i++) {
			
			if (aList[i] == '0') {
				if ((aList[i - 1] == '1' || aList[i - 1] == '2')) {
					pd[i] = pd[i - 2];
					continue;
				} else {
					return 0;
				}
			} else {
				int sum =  (aList[i - 1] - '0') * 10 + (aList[i] - '0');
				if (aList[i - 1] != '0' && sum <= 26) {
					pd[i] = pd[i - 1] + pd[i - 2];
				} else{
					pd[i] = pd[i - 1];
				}
			}

		}
		return pd[aList.length - 1];
	}
}
