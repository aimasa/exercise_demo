package exercise.demo.orangesrotting;

import java.util.LinkedList;
import java.util.Queue;

public class OrangesRotting {
	public int orangesRotting(int[][] grid) {
		int m = grid.length;
		int n = grid[0].length;
		Queue<int[]> queue = new LinkedList<int[]>();
		int greatIndex = 0;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (grid[i][j] == 2) {
					queue.offer(new int[] { i, j });
				}
				if (grid[i][j] == 1) {
					greatIndex++;
				}
			}
		}

		int count = 0;
		while (greatIndex > 0 && !queue.isEmpty()) {

			int size = queue.size();
			for (int i = 0; i < size; i++) {
				int[] index = queue.poll();
				if (index[1] + 1 < n && grid[index[0]][index[1] + 1] == 1) {
					grid[index[0]][index[1] + 1] = 2;
					queue.offer(new int[] { index[0], index[1] + 1 });
					greatIndex--;
				}
				if (index[1] - 1 >= 0 && grid[index[0]][index[1] - 1] == 1) {
					grid[index[0]][index[1] - 1] = 2;
					queue.offer(new int[] { index[0], index[1] - 1 });
					greatIndex--;
				}
				if (index[0] + 1 < m && grid[index[0] + 1][index[1]] == 1) {
					grid[index[0] + 1][index[1]] = 2;
					queue.offer(new int[] { index[0] + 1, index[1] });
					greatIndex--;
				}
				if (index[0] - 1 >= 0 && grid[index[0] - 1][index[1]] == 1) {
					grid[index[0]][index[1] - 1] = 2;
					queue.offer(new int[] { index[0] - 1, index[1] });
					greatIndex--;
				}
			}
			count++;
		}
		if (greatIndex != 0) {
			return -1;
		}
		return count;

	}
}
