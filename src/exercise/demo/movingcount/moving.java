package exercise.demo.movingcount;

import java.util.LinkedList;
import java.util.Queue;

public class moving {
    public int movingCount(int m, int n, int k) {

        
		Queue<int[]> queue = new LinkedList<int[]>();
		int[][] dp = new int[m][n];
		queue.offer(new int[] { 0, 0 });
        dp[0][0] = 1;
		int count = 1;
        
		while (!queue.isEmpty()) {
			int[] temp = queue.poll();
			if ((temp[0] + 1) < m && dp[temp[0] + 1][temp[1]] == 0
					&& ((temp[0] + 1) / 10 + (temp[0] + 1) % 10 + temp[1] / 10 + temp[1] % 10) <= k) {
				queue.add(new int[] { temp[0] + 1, temp[1] });
				dp[temp[0] + 1][temp[1]] = 1;
				count++;
			}
			if ((temp[1] + 1) < n && dp[temp[0]][temp[1] + 1] == 0
					&& ((temp[1] + 1) / 10 + (temp[1] + 1) % 10 + temp[0] / 10 + temp[0] % 10) <= k) {
				queue.add(new int[] { temp[0], temp[1] + 1 });
				dp[temp[0]][temp[1] + 1] = 1;
				count++;
			}
		}
		return count;
	
    
    }
}
