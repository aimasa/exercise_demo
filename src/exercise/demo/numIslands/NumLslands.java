package exercise.demo.numIslands;

import java.util.LinkedList;
import java.util.Queue;

public class NumLslands {
    public int numIslands(char[][] grid) {
        int xLen = grid.length;
        int yLen = grid[0].length;
        Queue<int[]> que = new LinkedList<int[]>();
        int count = 0;
        for(int i = 0; i < xLen; i++){
            for(int j = 0; j < yLen; j++){
                if(grid[i][j] != '1'){
                    continue;
            }
                count++;
                que.add(new int[]{i, j});
                    while (!que.isEmpty()){
                        int[] indexSub = que.poll();
                        int x = indexSub[0];
                        int y = indexSub[1];
                        for(int a = x + 1; a < xLen; a++){
                            if(grid[a][y] != '1'){
                                break;
                            }
                            que.add(new int[]{a, y});
                            grid[a][y] = '0';
                        }
                        for(int a = x - 1; a >= 0; a--){
                            if(grid[a][y] != '1'){
                                break;
                            }
                            que.add(new int[]{a , y});
                            grid[a][y] = '0';
                        }
                        for(int b = y + 1; b < yLen; b++){
                            if(grid[x][b] != '1'){
                                break;
                            }
                            que.add(new int[]{x, b});
                            grid[x][b] = '0';
                        }
                        for(int b = y - 1; b >= 0; b--){
                            if(grid[x][b] != '1'){
                                break;
                            }
                            que.add(new int[]{x, b});
                            grid[x][j] = '0';
                        }


                    }}
        }


        return count;

    }
}
