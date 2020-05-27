package exercise.demo.maxareaofisland;



public class MaxAreaOfIsland {
	public int maxAreaOfIsland(int[][] grid) {
		int maxCount = 0;
		for(int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				int count = findCount(grid, i, j) + 1;
				maxCount = maxCount > count ? maxCount : count;
			}
		}

		return maxCount;

	}

	public int findCount(int[][] grid, int x, int y) {
		if (x < 0 || y < 0 || x > grid.length - 1 || y > grid[0].length - 1 || grid[x][y] != 1) {
			return -1;
		}
		if(grid[x][y] == 1) {
			grid[x][y] = 0;
		}
		int hight = findCount(grid, x + 1, y) + 1;
		int weight = findCount(grid, x, y + 1) + 1;
        int chang = findCount(grid, x - 1, y) + 1;
		int kuan = findCount(grid, x, y - 1) + 1;
		return hight + weight + chang + kuan;

	}
}
