package exercise.demo.topkfrequent;

import sun.awt.datatransfer.DataTransferer;

import java.util.*;

public class TopKFrequent {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        PriorityQueue<Integer> que = new PriorityQueue<>(
            ((o1, o2) -> map.get(o1) - map.get(o2))
        );
        for(int num : map.keySet()){
            que.add(num);
            if(que.size() > k) {
                que.poll();
            }
        }
        int[] result = new int[k];

        for(int i = 0; i < k; i++){
            result[i] = que.poll();
        }
        return result;

    }
}
