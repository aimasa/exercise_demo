package exercise.demo.findmediansortedarrays;

/**
 * 对两个有序数列找到其中数
 * (注释掉的是自己写的，没有注释的是官方解法)
 * 
 * @author zhy
 *
 */
public class FindMedianSortedArrays {
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int s1 = nums1.length;
		int s2 = nums2.length;
		if (s2 < s1) {
			int[] temp = nums1;
			nums1 = nums2;
			nums2 = temp;
			int numTemp = s1;
			s1 = s2;
			s2 = numTemp;
		}
		int iMin = 0;
		int iMax = s1;
		int halfLen = (s1 + s2) / 2;
		while (iMax >= iMin) {
			int tempS1 = (iMin + iMax) / 2;
			int tempS2 = halfLen - tempS1;
			if (tempS1 > iMin && nums1[tempS1 - 1] > nums2[tempS2]) {
				iMax = tempS1 - 1;
			} else if (tempS1 < iMax && nums2[tempS2 - 1] > nums1[tempS1]) {
				iMin = tempS1 + 1;
			} else {
				int leftNum = 0;
				if(tempS2 == 0) {

				}
				else if (((s1 + s2) & 1) != 0) {
					return Math.max(nums1[tempS1], nums2[tempS2]);
				} else {
					return (Math.max(nums1[tempS1 - 1], nums2[tempS2 - 1])
							+ Math.min(nums1[tempS1], nums2[tempS2])) / 2.0;
				}
			}
		}
		return 0.0;
//		int mediaNumIndex = 0;
//		int otherMediaNumIndex = 0;
//		int numsLenth = nums1.length + nums2.length;
//		int[] tempNumArray = new int[numsLenth];
//		int nums1Index = 0;
//		int nums2Index = 0;
//		int tempIndex = 0;
//		while (tempIndex < numsLenth) {
//			if(nums1Index <= nums1.length - 1 && nums2Index <= nums2.length - 1) {
//			if (nums1[nums1Index] <= nums2[nums2Index] ) {
//				tempNumArray[tempIndex] = nums1[nums1Index];
//				nums1Index += 1;
//				tempIndex += 1;
//			}
//			else if(nums1[nums1Index] > nums2[nums2Index]){
//				tempNumArray[tempIndex] = nums2[nums2Index];
//				nums2Index += 1;
//				tempIndex += 1;
//			}}
//			if(nums1Index > nums1.length - 1) {
//				tempNumArray[tempIndex] = nums2[nums2Index];
//				nums2Index += 1;
//				tempIndex += 1;
//			}else if(nums2Index > nums2.length - 1) {
//				tempNumArray[tempIndex] = nums1[nums1Index];
//				nums1Index += 1;
//				tempIndex += 1;
//			}
//		}
//		if ((numsLenth & 1) != 0) {
//			mediaNumIndex = numsLenth >> 1;
//			return tempNumArray[mediaNumIndex];
//		} else {
//			mediaNumIndex = numsLenth >> 1;
//			otherMediaNumIndex = mediaNumIndex - 1;
//			return (tempNumArray[mediaNumIndex] + tempNumArray[otherMediaNumIndex])/2.0;
//		}
	}

}
