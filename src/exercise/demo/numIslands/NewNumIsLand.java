package exercise.demo.numIslands;

public class NewNumIsLand extends NumLslands{
    public int numIslands(char[][] grid) {
        int x = grid.length;
        int y = grid[0].length;
        int count = 0;
        for(int i = 0; i < x; i++){
            for(int j = 0; j < y; j++){
                if(grid[i][j] == '1'){
                    dfs(grid, i, j);
                    count++;
                }
            }
        }
        return count;
    }
    public void dfs(char[][] grid, int x, int y){
        if(x >= grid.length || x <0 || y >= grid[0].length || y < 0 || grid[x][y] == '0'){
            return;
        }
        if(grid[x][y] == '1'){
            grid[x][y] = '0';
        }
        dfs(grid, x - 1, y);
        dfs(grid,x+1,y);
        dfs(grid, x, y+ 1);
        dfs(grid,x, y-1);
    }
}
