package exercise.demo.maxslidingwindow;

import exercise.demo.maxprobability.MaxProbability;

import javax.crypto.spec.DESedeKeySpec;
import java.util.*;

public class MaxSlidingWindow {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> deque = new LinkedList<>();
        int n = nums.length;
        int[] result = new int[n - k + 1];
        for(int i = 0; i < nums.length; i++) {
            while (!deque.isEmpty() && i - k + 1 > deque.peekFirst()) {
                deque.pollFirst();
            }
            if (deque.isEmpty()) {
                deque.add(i);
            } else {
                if (nums[i] >= nums[deque.peekFirst()]) {
                    deque.clear();
                    deque.add(i);
                } else {
                    while (nums[i] >= nums[deque.peekLast()]) {
                        deque.pollLast();
                    }
                    deque.addLast(i);
                }
            }
            if(i - k + 1 >= 0){
                result[i - k + 1] = nums[deque.peekFirst()];
            }
            HashMap<Character, Integer> set = new HashMap<>();
        }

        Set<Character> set = new HashSet<>();
        return result;

    }

    public static void main(String[] args) {
        new MaxSlidingWindow().maxSlidingWindow(new int[]{1,3,-1,-3,5,3,6,7}, 3);
    }
}
