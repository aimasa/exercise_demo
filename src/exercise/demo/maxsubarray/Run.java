package exercise.demo.maxsubarray;

public class Run {
    public static void main(String[] args) {
        MaxSubArray maxSubArray = new MaxSubArray();
        int[] nums = new int[] {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray.maxSubArray(nums));
    }
}
