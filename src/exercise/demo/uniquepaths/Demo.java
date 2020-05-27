package exercise.demo.uniquepaths;

public class Demo {
    public static void main(String[] args) {
        UniquePaths uniquePaths = new UniquePathsTwoN();
        int num = uniquePaths.uniquePaths(7, 1);
        System.out.println(num);
    }
}