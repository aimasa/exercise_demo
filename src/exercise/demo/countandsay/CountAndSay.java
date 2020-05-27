package exercise.demo.countandsay;

import java.util.Stack;

public class CountAndSay {
	public String countAndSay(int n) {
		String[] dp = new String[n];
		dp[0] = "1";
		for (int i = 1; i < n; i++) {
			int point = 0;
			Stack<Character> tempCharacters = new Stack<Character>();
			String tempString = "";
			while (point < dp[i - 1].length()) {
				if (tempCharacters.empty() || tempCharacters.get(0) == dp[i - 1].charAt(point)) {
					tempCharacters.add(dp[i - 1].charAt(point));
					point++;
				} else if (tempCharacters.get(0) != dp[i - 1].charAt(point)) {
					int size = tempCharacters.size();
					char num = tempCharacters.get(0);
					tempString += Integer.toString(size);
					tempString += num;
					tempCharacters.clear();
					continue;
				}

			}
			if(!tempCharacters.empty()) {
				int size = tempCharacters.size();
				char num = tempCharacters.get(0);
				tempString += Integer.toString(size);
				tempString += num;
			}
			
			dp[i] = tempString;
		}
		return dp[n - 1];

	}
}
