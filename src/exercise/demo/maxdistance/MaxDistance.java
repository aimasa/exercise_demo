package exercise.demo.maxdistance;

import java.util.LinkedList;
import java.util.Queue;

import exercise.demo.longestpalindrome.newLongestPalindrome;

public class MaxDistance {
	public int maxDistance(int[][] grid) {
		Queue<int[]> queue = new LinkedList<int[]>();
		if(grid == null || grid.length == 0) {
			return -1;
		}
		
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				if (grid[i][j] == 1) {
					queue.offer(new int[] { i, j });
				}
			}
		}
		if(queue.size() == 0 || queue.size() == (grid[0].length * grid.length)) {
			return -1;
		}
		int lenth = 0;

		while (!queue.isEmpty()) {
			lenth++;
			int count = queue.size();
			for (int i = 0; i < count; i++) {
				int[] index = queue.poll();
				if (index[0] + 1 < grid.length && grid[index[0] + 1][index[1]] == 0) {
					grid[index[0] + 1][index[1]] = 2;
					queue.offer(new int[] { index[0] + 1, index[1] });
				}
				if (index[0] > 0 && grid[index[0] - 1][index[1]] == 0) {
					grid[index[0] - 1][index[1]] = 2;
					queue.offer(new int[] { index[0] - 1, index[1] });
				}
				if (index[1] + 1 < grid[0].length && grid[index[0]][index[1] + 1] == 0) {
					grid[index[0]][index[1] + 1] = 2;
					queue.offer(new int[] { index[0], index[1] + 1 });
				}
				if (index[1] > 0 && grid[index[0]][index[1] - 1] == 0) {
					grid[index[0]][index[1] - 1] = 2;
					queue.offer(new int[] { index[0], index[1] - 1 });
				}
			}
		}
		return lenth;

	}
}
