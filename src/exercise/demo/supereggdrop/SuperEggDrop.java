package exercise.demo.supereggdrop;

import java.util.Arrays;

public class SuperEggDrop {
	public int superEggDrop(int K, int N) {
		int[][] dp = new int[N + 1][K + 1];//dp[i][j] 表示：  i层楼j个蛋所用最少次数 dp[N][K]
		for(int i = 0; i <= N; i++) {
			Arrays.fill(dp[i], Integer.MAX_VALUE);
		}

		for(int i = 1; i <= K; i++) {
			dp[0][i] = 0;
			dp[1][i] = 1;
		}
		for(int i = 0; i <= N; i++) {
			dp[i][1] = i;
		}
		for (int i = 2; i <= N; i++) {
			for (int j = 2; j <= K; j++) {
				for (int x = 1; x <= i; x++) {
					dp[i][j] = Math.min(dp[i][j],Math.max(dp[i - x][j], dp[x - 1][j - 1]) + 1);
				}
			}
		}
		return dp[N][K];
	}
}
