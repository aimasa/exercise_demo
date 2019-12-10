package exercise.demo.maxsubarray;

public class MaxSubArray {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int ans = nums[0];
        for(int i = 0; i < nums.length; i++) {
            if(sum <= 0) {
                sum = nums[i];
            }else {
                sum = sum + nums[i];
            }
            ans = Math.max(sum, ans);
        }
		return ans;   
    }
}
