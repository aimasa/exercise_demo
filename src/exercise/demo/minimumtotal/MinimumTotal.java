package exercise.demo.minimumtotal;

import java.util.List;

public class MinimumTotal {
	public int minimumTotal(List<List<Integer>> triangle) {
		int[][] dp = new int[triangle.size()][triangle.size()];
		int minResult = Integer.MAX_VALUE;
		if (triangle.size() == 0) {
			return 0;
		}
		dp[0][0] = triangle.get(0).get(0);
		for (int i = 1; i < triangle.size(); i++) {
			dp[i][0] = dp[i - 1][0] + triangle.get(i).get(0);
			dp[i][i] = dp[i - 1][i - 1] + triangle.get(i).get(i);
			for (int j = 1; j < i; j++) {
				dp[i][j] = Math.min(dp[i - 1][j], dp[i - 1][j - 1]) + triangle.get(i).get(j);

			}
		}
		for (int j = 0; j < triangle.size(); j++) {
			minResult = minResult < dp[triangle.size() - 1][j] ? minResult : dp[triangle.size() - 1][j];
		}
		return minResult;
	}
}
