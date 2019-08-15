package exercise.demo.threesum;

public class Demo {
    public static void main(String[] args) {
        ThreeSum threeSum = new ThreeSum();
        int[] example = new int[] {1,0,-1,0,-2,2};
        System.out.println(threeSum.threeSum(example));
    }
}
