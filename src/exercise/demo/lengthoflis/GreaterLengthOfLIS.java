package exercise.demo.lengthoflis;

public class GreaterLengthOfLIS extends LengthOfLIS{
	public int lengthOfLIS(int[] nums) {
		int result = 0;
		int[] dp = new int[nums.length];
		for (int num : nums) {
			int i = 0;
			int j = result;
			while (i < j) {
				int middle = (i + j) / 2;
				if (num > dp[middle]) {
					i = middle + 1;
					continue;
				}
				j = middle;
			}
			dp[j] = num;
			if (result == j) {
				result++;
			}
		}
		return result;
	}
}
