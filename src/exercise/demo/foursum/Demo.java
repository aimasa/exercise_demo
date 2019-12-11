package exercise.demo.foursum;

public class Demo {
public static void main(String[] args) {
    FourSum threeSum = new FourSum();
    int[] example = new int[] {-1,0,1,2,-1,-4};
    System.out.println(threeSum.fourSum(example, -1));
}
}
