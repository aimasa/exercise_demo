package exercise.demo.removeelement;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int lenth = 0;
        int i = 0;
        for(int j = 0; j < nums.length; j++) {
            if(nums[j] == val) {
                continue;
            }
            nums[i] = nums[j];
            i += 1;
            lenth = lenth + 1;
        }
        return lenth;
    }
}
