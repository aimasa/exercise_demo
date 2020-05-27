package exercise.demo.majorityelement;

import java.util.Arrays;

public class MajorityElement {
	   public int majorityElement(int[] nums) {
		   if(nums.length == 1) {
			   return nums[0];
		   }
		   Arrays.sort(nums);
		   int length = nums.length /2;
		   int count = 1;
		   int result = 0;
           int maxCount = length;

		   for(int i = 1; i < nums.length; i++) {
			   if(nums[i - 1] != nums[i]) {
				   if(count >= maxCount) {
					   result = nums[i - 1];
	                   maxCount = count;
				   }
				   count = 1;
			   }
			   count++;
			  
		   }
		   return result;
	   }
}
