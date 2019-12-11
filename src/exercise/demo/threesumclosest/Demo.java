package exercise.demo.threesumclosest;

public class Demo {
    public static void main(String[] args) {
        ThreeSumClosest threeSumClosest = new ThreeSumClosest();
        int[] nums = new int[] {-1,2,1,-4};
        System.out.println(threeSumClosest.threeSumClosest(nums, 1));
    }
}
