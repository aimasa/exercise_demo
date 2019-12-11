package exercise.demo.foursum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> finalList = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
       
        int n = nums.length - 1;
        if (n < 4) {
            if (n == 3) {
                if (nums[0] + nums[1] + nums[2] + nums[3] == target) {
                    finalList.add(Arrays.asList(nums[0], nums[1], nums[2], nums[3]));
                }
            }
            return finalList;

        }
        for (int i = 0; i < n - 2; i++) {
            if(i > 0 && nums[i] == nums[i - 1]) {continue;}
            if(nums[i] + nums[i + 1] + nums[i + 2] + nums[i + 3] > target) {break;}
            if(nums[i] + nums[n] + nums[n - 1] + nums[n - 2] < target) {continue;}
            for(int j = i + 1; j < n - 1; j++) {
                int left = j + 1;
                int right = n;
                if(j > i +1 && nums[j] == nums[j - 1]) {continue;}
                if(nums[i] + nums[j] + nums[j + 1] + nums[j + 2] > target) {break;}
                if(nums[i] + nums[j] + nums[n] + nums[n - 1] < target) {continue;}
                while(left < right) {
                    if(nums[i] + nums[j] + nums[left] + nums[right] > target) {
                        right--;
                    }
                    else if(nums[i] + nums[j] + nums[left] + nums[right] < target){
                       left++;
                    }
                    else if(nums[i] + nums[j] + nums[left] + nums[right] == target){
                        finalList.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        while (right > left && nums[right - 1] == nums[right]) {
                            right--;
                        }
                        while (right > left && nums[left + 1] == nums[left]) {
                            left++;
                        }
                        left++;
                        right--;
                    }
                }
            }
        }
        return finalList;
        
    }
}
