package exercise.demo.lengthoflis;

public class LengthOfLIS {
    public int lengthOfLIS(int[] nums) {
        int[] result = new int[nums.length];
        result[0] = nums[0];
        int right = 0;
        int left = 0;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] >= result[right]){
                right++;
                result[right] = nums[i];
            }else{
                while(left <= right && nums[left] <= nums[i]){
                    left++;
                }
                result[left] = nums[i];
                left = 0;
            }
        }
        return right + 1;

    }

    public static void main(String[] args) {
        int[] nums = new int[]{10,9,2,5,1,2,3,7,5};
        new LengthOfLIS().lengthOfLIS(nums);
    }
}
