package exercise.demo.numberofsubarrays;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class NumberOfSubarrays {
    public int numberOfSubarrays(int[] nums, int k) {
        int length = nums.length;
        List<Integer> oddIndex = new ArrayList<Integer>();

        int i = 0;
        int result = 0;
        int lastIndex = -1;
        while(i < length){
            int count = 1;
            if(!oddIndex.isEmpty()){
                int index = oddIndex.remove(0);
                i = index + 1;

                lastIndex = oddIndex.size() == 0 ? -1 : oddIndex.get(oddIndex.size() - 1) + 1;
            }

            while(nums[i] % 2 != 1){i++;count++;}
            i = lastIndex == -1?i : lastIndex;
            lastIndex = -1;

            while(i < length && oddIndex.size() < k){
                while(i < length && nums[i] % 2 != 1){i++;}
                if(i >= length){
                    break;
                }


                oddIndex.add(i);
                i++;
                if(oddIndex.size() == k){
                    break;
                }

            }
            if(oddIndex.size() == k){
                int temp = count;
                count = 1;
                while(i < length && nums[i] % 2 != 1){i++;count++;}
                temp = temp * count;
                result += temp;}

        }
        return result;

    }

    public static void main(String[] args) {
        int[] num = new int[]{1,2,1,2,0,1};
        int k = 1;
        new NumberOfSubarrays().numberOfSubarrays(num, k);
    }
}