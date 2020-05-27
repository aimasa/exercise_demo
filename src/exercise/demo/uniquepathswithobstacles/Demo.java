package exercise.demo.uniquepathswithobstacles;

public class Demo {
public static void main(String[] args) {
	UniquePathsWithObstacles uniquePathsWithObstacles = new UniquePathsWithObstacles();
	int[][] obstacleGrid = new int[][] {{0,0,0},{0,1,0}};
	uniquePathsWithObstacles.uniquePathsWithObstacles(obstacleGrid);
}
}
