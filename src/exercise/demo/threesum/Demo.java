package exercise.demo.threesum;

import java.util.function.IntPredicate;

public class Demo {
    public static void main(String[] args) {
        ThreeSum threeSum = new ThreeSum();
        int[] example = new int[] {0,0,0,0};
        System.out.println(threeSum.threeSum(example));
    }
}
