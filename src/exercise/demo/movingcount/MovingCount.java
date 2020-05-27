package exercise.demo.movingcount;

import java.util.LinkedList;
import java.util.Queue;

public class MovingCount {
	
	private int[][] dirctions = new int[][] {
		{1,0},{0,1},{-1,0},{0,-1}
	};
	
	public int movingCount(int m, int n, int k) {
		Queue<int[]> queue = new LinkedList<int[]>();
		boolean[][] dp = new boolean[m][n];
		queue.offer(new int[] { 0, 0 });
		int count = 1;
		dp[0][0] = true;
		int[] bia = new int[] { 1, 0 };
		while (!queue.isEmpty()) {
			int[] temp = queue.poll();
			for(int[] dir : dirctions) {
				int x = temp[0] + dir[0];
				int y = temp[1] + dir[1];
				if(x < 0 || x >= m || y < 0 || y >= n) continue;
				if(dp[x][y]) continue;
				int sum = x / 10 + x % 10 + y / 10 + y % 10;
				if(sum > k) continue;
				queue.add(new int[] { x, y});
				dp[x][y] = true;
				count++;
			}
		}
		return count;
	}
}
