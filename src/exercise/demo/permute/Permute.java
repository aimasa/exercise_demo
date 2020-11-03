package exercise.demo.permute;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Permute  {
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> set = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        permuteByTep(nums, set, result);
        return result;
    }
    public void permuteByTep(int[] nums, List<Integer> set, List<List<Integer>> result){
        if(set.size() == nums.length){
            result.add(new ArrayList<>(set));
            return;
        }
        for(int i = 0; i < nums.length; i++){
            if(set.contains(nums[i])){
                continue;
            }
            StringBuffer sb = new StringBuffer();
            String s = "0";
            String st = s.substring(0, 0);
            sb.append(st);
            set.add(nums[i]);
            permuteByTep(nums, set, result);
            set.remove(nums[i]);
        }
    }
}
