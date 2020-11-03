package exercise.demo.search;

public class Search {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while(left <= right){
            int mid = (left + right) / 2;
            if(nums[mid] == target){
                return mid;
            }
            if(nums[mid] >= nums[0]){
                if(nums[mid] > target){
                    if(nums[0] > target){
                        left = mid + 1;
                    }else {
                        right = mid - 1;
                    }
                }else{
                    left = mid + 1;
                }
            }else{
                if(nums[mid] < target){
                    if(target < nums[0]){
                        left = mid + 1;
                    }else{
                        right = mid - 1;
                    }
                }else{
                    right = mid - 1;
                }
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int[] nums = new int[]{5,6};
        new Search().search(nums, 7);
    }
}
