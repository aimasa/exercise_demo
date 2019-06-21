package exercise.demo.longestpalindrome;

/**
 * 求最长回文串，用的是Manacher's algorithm算法
 * @author Mloong
 *
 */
public class LongestPalindrome {
	public String longestPalindrome(String s) {
		if (s == null || s.length() < 1) {
			return s;
		}
		String strData = preStrData(s);
		int[] p = new int[strData.length()];
		p[0] = 1;
		int ci = 0;
		int maxI = 0;
		
		for(int i = 1;i < strData.length();i++) {
			int l = 1;
			if(i < p[ci] + ci) {
				int j = 2 * ci - i;
				if(j - p[j] > ci - p[ci]) {
					p[i] = p[j];
					continue;
				} else {
					l = ci + p[ci] - i;
				}
			}
			
			while(i - l>=0 && l+i <strData.length() && strData.charAt(l+i)==strData.charAt(i - l)) {
				l = l + 1;
			}
			
			p[i] = l;
			
			if(i + p[i] > ci + p[ci]) {
				ci = i;
			}
			
			if(p[i] > p[maxI]) {
				maxI = i;
			}
		}
		
		return strData.substring(maxI - p[maxI] + 1, maxI + p[maxI] - 1).replace("#", "");
	}

	private String preStrData(String s) {
		char[] chars = new char[s.length() * 2 + 1];
		for (int i = 0; i < s.length(); i++) {
			chars[i * 2] = '#';
			chars[i * 2 + 1] = s.charAt(i);
		}
		chars[chars.length - 1] = '#';
		return new String(chars);
		
		
//		String[] sSplit = new String[s.length() * 2 + 3];
//		String[] sSplit = new String[s.length() * 2 + 1];
//		int j = 0;
//		sSplit[j] = "$";
//		sSplit[j] = "#";
//		for (int i = 0; i < s.length(); i++) {
//			sSplit[++j] = String.valueOf(s.charAt(i));
//			sSplit[++j] = "#";
//		}
//		sSplit[++j] = "^";
//		return sSplit;
	}
}
