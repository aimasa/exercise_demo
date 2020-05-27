package exercise.demo.maxareaofisland;

public class Demo {
	public static void main(String[] args) {
        int[][] grid = new int[][] {{1,1,0,0,0},{1,1,0,0,0},{0,0,0,1,1},{0,0,0,1,1}};
        new MaxAreaOfIsland().maxAreaOfIsland(grid);
	}
}
