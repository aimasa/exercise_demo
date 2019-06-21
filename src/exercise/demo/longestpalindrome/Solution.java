package exercise.demo.longestpalindrome;

/**
 * ±©Á¦ÆÆ½â
 * @author Mloong
 *
 */
public class Solution {
	public String longestPalindrome(String s) {
		String strData = preStrData(s);
		int max = 0;
		int index = 0;
//		int tempLenth = 0;
		for (int i = 0; i < strData.length(); i++) {
			int tempLenth = 0;
			for (int j = i; 2 * i - j >= 0 && j < strData.length(); j++) {
				if (strData.charAt(j) == strData.charAt(2 * i - j)) {
					tempLenth++;
				} else {
					break;
				}

			}
			if (max < tempLenth) {
				max = tempLenth;
				index = i;
			}
		}

		return strData.substring(index - max + 1, index + max).replace("#", "");
	}

	private String preStrData(String s) {
		char[] chars = new char[s.length() * 2 + 1];
		for (int i = 0; i < s.length(); i++) {
			chars[i * 2] = '#';
			chars[i * 2 + 1] = s.charAt(i);
		}
		chars[chars.length - 1] = '#';
		return new String(chars);
	}
}
