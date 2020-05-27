package exercise.demo.minimumtotal;

import java.util.List;

public class GreaterMinimumTotal extends MinimumTotal{

	public int minimumTotal(List<List<Integer>> triangle) {
		int[][] dp = new int[triangle.size() + 1][triangle.size() + 1];
		if (triangle == null || triangle.size() == 0 ) {
			return 0;
		}
		for (int i = triangle.size(); i >= 0; i--) {
			for (int j = 0; j <= i; j++) {
				dp[i][j] = Math.min(dp[i + 1][j], dp[i + 1][j + 1]) + triangle.get(i).get(j);
			}
		}
		
		return dp[0][0];
	}

}
