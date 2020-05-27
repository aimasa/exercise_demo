package exercise.demo.surfacearea;

public class Demo {
	public static void main(String[] args) {
		int[][] grid = new int[][] { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };
		new SurfaceArea().surfaceArea(grid);
	}
}
