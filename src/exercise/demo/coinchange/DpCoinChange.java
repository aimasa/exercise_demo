package exercise.demo.coinchange;

import java.util.Arrays;

public class DpCoinChange {
	public int coinChange(int[] coins, int amount) {
		int[] dp = new int[amount + 1];
		Arrays.fill(dp, amount + 1);
		dp[0] = 0;
		for (int i = 0; i < amount + 1; i++) {
			for (int j = 0; j < coins.length; j++) {
				if(i - coins[j] < 0) {
					continue;
				}
				dp[i] = Math.min(dp[i - coins[j]] + 1, dp[i]);
			}
		}
		return dp[amount + 1] == amount + 1? -1: dp[amount + 1];

	}
}
