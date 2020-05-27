package exercise.demo.sortarray;

public class SortArray {
	public int[] sortArray(int[] nums) {
		quickSort(nums, 0, nums.length - 1);
		return nums;

	}

	public void quickSort(int[] nums, int left, int right) {
		if (left >= right) {
			return;
		}
		int begin = left;
		int end = right;
		int key = nums[begin];
		while (left < right) {
			while (left < right && nums[right] > key) {
				right--;
			}
			if (left < right) {
				swap(nums, right, left);
			}
			while (left < right && nums[left] <= key) {
				left++;
			}
			if (left < right) {
				swap(nums, right, left);
			}
		}
		quickSort(nums, begin, right - 1);
		quickSort(nums, right + 1, end);
	}

	public void swap(int[] nums, int left, int right) {
		int temp = nums[left];
		nums[left] = nums[right];
		nums[right] = temp;
	}
}
