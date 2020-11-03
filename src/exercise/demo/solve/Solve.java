package exercise.demo.solve;

import java.util.LinkedList;
import java.util.Queue;

public class Solve {
    public void solve(char[][] board) {
        Queue<int[]> indexQue = new LinkedList<>();
        if(board.length == 0){
            return;
        }
        int xLen = board.length;
        int yLen = board[0].length;
        for(int i = 0; i < xLen; i++){
            if(board[i][0] == 'O'){
                indexQue.add(new int[]{i, 0});
            }
        }
        for(int j = 1; j < yLen; j++){
            if(board[0][j] == 'O'){
                indexQue.add(new int[]{0, j});
            }
        }
        for(int j = 0; j < yLen; j++){
            if(board[xLen - 1][j] == 'O'){
                indexQue.add(new int[]{xLen - 1, j});
            }
        }
        for(int i = 0; i < xLen; i++){
            if(board[i][yLen - 1] == 'O'){
                indexQue.add(new int[]{i, yLen - 1});
            }
        }
        while(!indexQue.isEmpty()){
            int[] index = indexQue.poll();
            int x = index[0];
            int y = index[1];
            if(board[x][y] != 'O'){
                continue;
            }
            board[x][y] = 'P';
            if(x - 1 >= 0 && board[x - 1][y] == 'O'){
                board[x - 1][y] = 'P';
                indexQue.add(new int[]{x - 1, y});
            }
            if(x + 1 < xLen && board[x + 1][y] == 'O'){
                board[x + 1][y] = 'P';
                indexQue.add(new int[]{x + 1, y});
            }
            if(y - 1 >= 0 && board[x][y - 1] == 'O'){
                indexQue.add(new int[]{x, y - 1});
            }
            if(y + 1 < yLen && board[x][y + 1] == 'O'){
                indexQue.add(new int[]{x, y + 1});
            }
        }
        for(int i = 0; i < xLen; i++){
            for(int j = 0; j < yLen; j++){
                if(board[i][j] == 'P'){
                    board[i][j] = 'O';
                }
                else if(board[i][j] == 'O'){
                    board[i][j] = 'X';
                }
            }
        }


    }

    public static void main(String[] args) {
        char[][] board = new char[][]{{'O', 'O', 'O'}, {'O', 'O', 'O'}, {'O', 'O', 'O'}};
        new Solve().solve(board);
    }
}