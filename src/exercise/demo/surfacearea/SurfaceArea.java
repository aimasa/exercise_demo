package exercise.demo.surfacearea;

public class SurfaceArea {
	   public int surfaceArea(int[][] grid) {
	        int sum = 0;
	        int count = 0;
	        for(int i = 0; i < grid.length; i++){
	            for(int j = 0; j < grid[0].length; j++){
	                if(grid[i][j] == 0){
	                    continue;
	                }
	                if(i > 0 && grid[i - 1][j] != 0 && grid[i][j] > grid[i - 1][j]){
	                    count += grid[i - 1][j];
	                }
	                if(i > 0 && grid[i - 1][j] != 0 && grid[i][j] <= grid[i - 1][j]){
	                    count += grid[i][j];
	                }
	                if(j > 0 && grid[i][j - 1] != 0 && grid[i][j] < grid[i][j - 1]){
	                    count += grid[i][j];
	                }
	                if(j > 0 && grid[i][j - 1] != 0  && grid[i][j] >= grid[i][j - 1]){
	                    count += grid[i][j - 1];
	                }
	                sum += grid[i][j];
	                count += (grid[i][j] - 1) * 2;
	            }
	        }
	        int result = sum * 6 - count;
	        return result;
	   }
}
