package exercise.demo.permute;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Permute {
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> numsList = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            numsList.add(nums[i]);
        }
        List<List<Integer>> result = new ArrayList<>();
        tree(result, numsList, 0);
        return result;

    }
    public void tree(List<List<Integer>> result, List<Integer> nums, int first){
        int n = nums.size();
        if(first == n - 1){
            result.add(new ArrayList<Integer>(nums));
        }
        for(int i = first; i < n; i++){
            Collections.swap(nums, first, i);
            tree(result, nums, first + 1);
            Collections.swap(nums, first, i);
        }
    }
}
