package exercise.demo.coinchange;


public class CoinChange {
	public int coinChange(int[] coins, int amount) {
		if(coins == null) {
			return -1;
		}
		if(coins.length == 1) {
			if(coins[0] == amount) {
				return 1;
			} 
			return -1;
		}
		int[] memo = new int[amount + 1];
		dpCoin(amount, coins, memo);
		return amount;

	}

	public int dpCoin(int remainCoin, int[] coins, int[] memo) {
		if (remainCoin < 0) {
			return -1;
		}
		if (remainCoin == 0) {
			return 0;
		}
	    if(memo[remainCoin] != 0) {
	    	return memo[remainCoin];
	    }
		int res = Integer.MAX_VALUE;
		for (int i = 0; i < coins.length; i++) {

            int subProblem = dpCoin(remainCoin - coins[i], coins, memo);
            if (subProblem == -1) {
				continue;
			}
			res = Math.min(res, 1 + subProblem);

		}
		if (res == Integer.MAX_VALUE) {
			res =  -1;
		}
		memo[remainCoin] = res;
		return res;

	}
	
}
