package exercise.demo.search;

import java.util.HashSet;
import java.util.Set;

public class SearchTwo {
    public int search(int[] nums, int target) {
        Set<Integer> temp = new HashSet<Integer>();

        return Search(nums, 0,nums.length - 1,target);

    }
    public int Search(int[] nums, int left, int right, int target){
        if(right < left){
            return -1;
        }
        int mid = (right + left) / 2;
        if(target == nums[mid]){
            return mid;
        }
        if (nums[mid] >= nums[left]) {
            if (target < nums[mid] && target >= nums[left]) {
                return Search(nums, left, mid - 1, target);
            } else {
                return Search(nums, mid + 1, right, target);
            }
        } else {
            if (target > nums[mid] && target < nums[left]) {

                return Search(nums, mid + 1, right, target);
            } else{
                return Search(nums, left, mid - 1, target);
            }
        }



    }
}
