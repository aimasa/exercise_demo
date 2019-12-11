package exercise.demo.threesumclosest;

import java.util.Arrays;

public class ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        if (nums == null || nums.length < 3) {
            return 0;
        }
        int result = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length - 1; i++) {
            int right = nums.length - 1;
            int left = i + 1;
            while (left < right) {
                int tempResult = nums[i] + nums[right] + nums[left];
                if (Math.abs(target - result) >  Math.abs(target - tempResult)) {
                    result = tempResult;}
                    if(tempResult > target) {right--;}
                    else if(tempResult < target) {left++;}
                    else {
                        return result;
                    }
            }
        }
        return result;

    }
}
