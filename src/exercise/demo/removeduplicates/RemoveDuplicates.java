package exercise.demo.removeduplicates;


public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int newIndex = 0;
//        newNum[newIndex] = nums[0];
        for(int i = 1; i < nums.length; i++) {
            if(nums[i - 1]!= nums[i]) {
                newIndex += 1;
                nums[newIndex] = nums[i];
            }
            continue;
        }
        return newIndex + 1;
        
    }
}
