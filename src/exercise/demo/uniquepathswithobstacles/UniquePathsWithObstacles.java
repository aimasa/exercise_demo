package exercise.demo.uniquepathswithobstacles;

import java.util.Arrays;

public class UniquePathsWithObstacles {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
    	int[] cur = new int[obstacleGrid[0].length];
    	Arrays.fill(cur,1);
    	for(int i = 0; i < obstacleGrid.length; i ++) {
    		for(int j = 0; j < obstacleGrid[0].length; j++) {
    			if(obstacleGrid[i][j] == 1) {
    				cur[j] = 0;
    				continue;
    			}
    			if(j == 0) {
    				cur[j] = cur[j] == 0?0:1;
    				continue;
    			}
    			if(i == 0) {
    				cur[j] = cur[j - 1] ==0?0:1;
    				continue;
    			}
    			cur[j] += cur[j - 1];
    		}
    	}
		return cur[obstacleGrid[0].length - 1];
        
    }
}
