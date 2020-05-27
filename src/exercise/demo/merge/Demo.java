package exercise.demo.merge;

public class Demo {
    public static void main(String[] args) {
//        int[] A = new int[] {1, 2, 3, 0, 0, 0};
//        int[] B = new int[] {2, 5, 6};
//        new Merge().merge(A, 3, B, 3);
//        for (int i = 0; i < A.length; i++)
//            System.out.print(A[i] + ",");
//    }
        int[][] A = new int[][]{{2,3},{4,5},{6,7},{8,9},{1,10}};
        new mergeBlock().merge(A);

    }
}
