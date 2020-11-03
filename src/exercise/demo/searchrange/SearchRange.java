package exercise.demo.searchrange;

import java.util.*;

public class SearchRange {
    public int[] searchRange(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while(left < right){
            int mid = (left + right) / 2;
            if(target <= nums[mid]){
                right = mid;
            }
            else{
                left  = mid + 1;
            }
        }
        System.out.println(left);
        right = left;
        while(right < nums.length && left >= 0 && nums[right] != target && nums[left] != target){
            if(nums[right] == target){
                right++;
            }
            if(nums[left] == target){
                left--;
            }
        }
        int[] result = new int[]{left + 1, right - 1};
        int[] result1 = new int[]{1,2,3,4};
        List<int[]> re = new ArrayList<>();
        int[][] temp = re.toArray(new int[2][]);
        Arrays.sort(new int[][]{{1, 2}, {3, 4}}, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        return result;


    }
}
