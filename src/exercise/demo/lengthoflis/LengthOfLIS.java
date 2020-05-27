package exercise.demo.lengthoflis;

public class LengthOfLIS {
	public int lengthOfLIS(int[] nums) {
		if (nums == null || nums.length == 0) {
			return 0;
		}
		int[] dp = new int[nums.length];
		int result = dp[0];
		dp[0] = 1;
		for (int i = 1; i < nums.length; i++) {
			int maxCount = 0;
			for (int j = 0; j < i; j++) {
				if (nums[i] > nums[j]) {
					maxCount = Math.max(maxCount, dp[j]);

				}
			}
			dp[i] = maxCount + 1;
			result = result > dp[i] ?result :  dp[i]; 
		}
		return result;
	}
}
