package exercise.demo.generate;

import exercise.demo.type.ListNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Generate {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> dp = new ArrayList<>();
        if(numRows == 0){
            return result;
        }
        result.add(new ArrayList<>(1));
        if(numRows == 1){
            return result;
        }
        dp.add(1);
        dp.add(1);
        result.add(dp);
        for(int i = 2; i < numRows; i++){
            List<Integer> temp = new ArrayList<>();
            temp.add(1);
            for(int j = 1; j < i - 1; j++){
                dp.add(dp.get(j) + dp.get(j - 1));
            }
            dp.add(1);
            result.add(dp);
        }
        return result;
        
}
}
