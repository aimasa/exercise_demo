package exercise.demo.subsets;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        Stack<Integer> subResult = new Stack<>();
        List<List<Integer>> result = new ArrayList<>();
        target(0, nums, subResult, result);
        return result;

}
    public void target(int n, int[] nums, Stack<Integer> subResult, List<List<Integer>> result){
        if(n == nums.length){
            result.add(subResult);
            return;
        }
            subResult.push(nums[n]);
            target(n + 1, nums, subResult, result);


        }
    }


