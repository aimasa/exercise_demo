package exercise.demo.findmediansortedarrays;

public class Demo {
public static void main(String[] args) {
	int[] nums1 = {};
	int[] nums2 = {0,3};
	FindMedianSortedArrays findMedianSorted = new FindMedianSortedArrays();
	double result = findMedianSorted.findMedianSortedArrays(nums1, nums2);
//	Solution solution = new Solution();
//	double result = solution.findMedianSortedArrays(nums1, nums2);
	System.out.println(result);
}
}
