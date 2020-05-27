package exercise.demo.jump;

import java.util.Arrays;

public class Jump {
    public int jump(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for(int i = 0; i < nums.length; i++){
            int length = nums[i];
            int cor = 1;
            while(cor <= length && cor < nums.length - i){
                dp[cor + i] = Math.min(dp[cor + i], dp[i] + 1);
                System.out.println("cor:"+cor);
                cor++;
            }
        }
        return dp[nums.length - 1];

    }

    public static void main(String[] args) {
        int[] nums = new int[]{2,3,1,1,4};
        new Jump().jump(nums);
    }
}
