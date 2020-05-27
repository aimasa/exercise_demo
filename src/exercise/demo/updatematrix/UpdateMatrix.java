package exercise.demo.updatematrix;

import java.util.LinkedList;
import java.util.Queue;

public class UpdateMatrix {
    public int[][] updateMatrix(int[][] matrix) {
        Queue<int[]> queue = new LinkedList<>();
        
        int[][] result = new int[matrix.length][matrix[0].length];
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] == 0){
                    queue.add(new int[]{i, j});
                }
            }
        }
        while (!queue.isEmpty()){
            int[] index = queue.poll();
            int x = index[0];
            int y = index[1];

            if(x > 0 && matrix[x - 1][y] == 1){
                matrix[x - 1][y] = 0;
                result[x - 1][y] = 1 + result[x][y];
                queue.add(new int[]{x - 1, y});
            }
            if(y > 0 && matrix[x][y - 1] == 1){
                matrix[x][y - 1] = 0;
                result[x][y - 1] = 1 + result[x][y];
                queue.add(new int[]{x, y - 1});
            }
            if(y < matrix[0].length - 1 && matrix[x][y + 1] == 1){
                matrix[x][y + 1] = 0;
                result[x][y + 1] = 1 + result[x][y];
                queue.add(new int[]{x, y + 1});
            }
            if(x < matrix.length - 1 && matrix[x + 1][y] == 1){
                matrix[x + 1][y] = 0;
                result[x + 1][y] = 1 + result[x][y];
                queue.add(new int[]{x + 1, y});
            }

        }
        return result;


    }
}
