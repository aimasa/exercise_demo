package exercise.demo.weekly;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], i);
        }
        int left = 0;

        while(left < nums.length){
            int sum = 0;
            if(left > 0 && nums[left] == nums[left - 1]){
                left++;
                continue;
            }
            int temp = sum - nums[left];

            for(int i = left + 1; i < nums.length; i++){
                int last = temp;

                List<Integer> numList = new ArrayList<>();
                if(i > left + 1 && nums[i] == nums[i - 1]){
                    continue;
                }
                last -= nums[i];
                if(map.containsKey(last) && map.get(last) > i){
                    numList.add(nums[left]);
                    numList.add(nums[i]);
                    numList.add(last);
                    result.add(numList);
            }
        }
            left++;

    }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-1,0,1,2,-1,-4};
        new ThreeSum().threeSum(nums);
    }

}
