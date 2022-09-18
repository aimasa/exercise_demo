package exercise.demo.largestLocal;

public class largestLocal {
    public int[][] largestLocal(int[][] grid) {
        int[][] res = new int[grid.length / 3][grid[0].length / 3];
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(i + 2 < grid.length & j + 2 < grid[0].length){
                    res[i /3][j / 3] = maxNum(grid, i, j);

                }
            }}
            return res;
        }
        public int maxNum(int[][] grid, int startx, int starty){
            int max = grid[startx][starty];
            for(int i = startx; i < grid.length& i - startx < 3; i++){
                for(int j = starty; j < grid[0].length& j - starty < 3; j++){
                    max = Math.max(grid[i][j], max);
                }
            }
            return max;
        }
}
