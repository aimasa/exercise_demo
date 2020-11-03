package exercise.demo.wigglesort;

import java.util.PriorityQueue;
import java.util.Queue;

public class WiggleSort {
    public void wiggleSort(int[] nums) {
        int mid = nums.length / 2;
        int tmpMid = sortArray(nums, 0, nums.length - 1);

        while(tmpMid != mid){
            if(tmpMid < mid){
                tmpMid = sortArray(nums, tmpMid + 1, nums.length - 1);
            }else{
                tmpMid = sortArray(nums, 0, tmpMid - 1);
            }
        }
        // System.out.println("mid : " + mid);
        int[] tmp = new int[nums.length];
        System.arraycopy(nums, 0, tmp, 0, nums.length);
        int numsIndex = 0;
        int leftIndex = 0;
        int rightIndex = tmpMid;
        System.out.println(tmpMid);
        while(leftIndex < tmpMid + 1){
            nums[numsIndex] = tmp[leftIndex];
            numsIndex++;
            if(numsIndex >= nums.length){
                return;
            }
            PriorityQueue<int[]> queue = new PriorityQueue<>((a, b) -> a[0] - b[1]);
            nums[numsIndex] = tmp[leftIndex + tmpMid + 1];
            leftIndex++;
            numsIndex++;
        }


    }
    public static void convert(int left, int right, int[] nums){
        int tmp = nums[left];
        nums[left] = nums[right];
        nums[right] = tmp;
    }

    public static int sortArray(int[] nums, int left, int right){
        while(left < right){
            while(left < right && nums[left] < nums[right]){
                right--;
            }
            if(right == left){
                return left;
            }
            convert(left, right, nums);
            left++;
            while(right > left && nums[left] <= nums[right]){
                left++;
            }
            if(right == left){
                return right;
            }
            convert(left, right, nums);
            right--;
        }
        return left;
    }


    public static void main(String[] args) {
        new WiggleSort().wiggleSort(new int[]{1,3,2,2,3,1});
    }
}
