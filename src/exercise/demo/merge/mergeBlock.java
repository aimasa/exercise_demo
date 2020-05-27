package exercise.demo.merge;

import exercise.demo.type.ListNode;

import java.sql.Array;
import java.util.*;

public class mergeBlock {
    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, (v1, v2) -> v1[0] - v2[0]);
        List<int[]> result = new ArrayList<int[]>();
        int index = intervals.length;
        if(index == 0){
            return new int[0][0];
        }
        int[] temp = intervals[0];

        for(int i = 0 ; i < index; i++){

            if(temp[1] >= intervals[i][1] || temp[1] >= intervals[i][0]){
                temp[1] = Math.max(intervals[i][1], temp[1]);

            }else {
                result.add(temp);
                temp = intervals[i];
            }
            if(!result.contains(temp)){
                result.add(temp);
            }
        }
        return result.toArray(new int[result.size()][2]);
    }
}
