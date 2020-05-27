package exercise.demo.lengthoflongestsubstring;

public class test {
    public static void main(String[] args) {
 		String str = "abcab";
		Solution solution = new LengthOfLongestSubstring();
		int t = solution.lengthOfLongestSubstring(str);
		System.out.println(t);
 	}
}
