package exercise.demo.search;

public class search {
    public int search(int[] nums, int target) {
        if (nums.length == 0) {
            return -1;
        }
        int right = nums.length - 1;
        int left = 0;
        if (right == left) {
            return nums[left] == target ? 0 : -1;
        }
        int mid = 0;
        while (right >= left) {
            mid = (right + left) / 2;
            if(target == nums[mid]){
                return mid;
            }
            if (nums[mid] >= nums[left]) {
                if (target < nums[mid] && target >= nums[left]) {
                    right = mid - 1;
                } else {
                        left = mid + 1;
                }
            } else {
                if (target > nums[mid] && target < nums[left]) {
                    left = mid + 1;
                } else{
                    right = mid - 1;
                }
            }
        }
        return -1;


    }
}
