package exercise.demo.twosun;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoSun {
    public List<List<Integer>> twoSun(int[] nums) {
        sort(nums);
        int right = 0;
        int left = nums.length - 1;
        List<List<Integer>> resultTwoSunLists = new ArrayList<List<Integer>>();
        while (right < left) {
            if (nums[left] + nums[right] > 0) {
                left = left - 1;
            }
            if (nums[left] + nums[right] < 0) {
                right = right + 1;
            } else {
                resultTwoSunLists.add(Arrays.asList(nums[right], nums[left]));
                while (right < left && nums[right + 1] == nums[right]) {
                    right++;
                }while (right < left && nums[left - 1] == nums[left]) {
                    left--;
                }
            }
        }
        return resultTwoSunLists;
    }
    
    private void sort(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int left = 0;
            int right = i - 1;
            int temp = nums[i];
            while (left <= right) {
                int mid = (right + left) >> 1;
                if (nums[mid] > temp) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            for (int j = i - 1; j >= left; j--) {
                nums[j + 1] = nums[j];
            }
            nums[left] = temp;
        }
    }
}
