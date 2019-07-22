package exercise.demo.threesum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> resultNumList = new ArrayList<List<Integer>>();
        if (nums == null || nums.length < 3) {
            return resultNumList;
        }
        int re = 1;
        for (int i = 0; i < nums.length; i++) {
            
            int right = i + 1;
            int left = nums.length - 1;
            if (nums[i] > 0) {
                break;
            }
            if (i >= 1 && nums[i] == nums[i - 1]) {
                continue;
            }
            
            while (right < left) {
                if (nums[i] + nums[left] + nums[right] < 0) {
                    right = right + 1;
                } else if (nums[i] + nums[left] + nums[right] > 0) {
                    left = left - 1;
                } else {
                    resultNumList.add(Arrays.asList(nums[i], nums[right], nums[left]));
                    while (left > right && nums[right + 1] == nums[right]) {
                        right++;
                    }
                    while (left > right && nums[left - 1] == nums[left]) {
                        left--;
                    }
                    right++;
                    left--;
                }
            }
        }
        return resultNumList;
    }
}
