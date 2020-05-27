package exercise.demo.gameoflife;

import java.util.Arrays;

public class GameOfLife {
	public void gameOfLife(int[][] board) {
		int[][] temp = new int[board.length][board[0].length];
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				temp[i][j] = board[i][j];
			}
		}
		int[] neb = new int[] { 1, 0, -1 };
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				int count = 0;
				for (int x = 0; x < 3; x++) {
					for (int y = 0; y < 3; y++) {
						if (!(neb[i] == 0 && neb[j] == 0)) {
							int col = neb[x] + i;
							int cow = neb[y] + j;
							if (col >= 0 && cow >= 0 && col < board.length && cow < board[0].length
									&& temp[col][cow] == 1) {
								count++;
							}
						}
					}
				}
				if(board[i][j] == 1 &&(count < 2 || count > 3) ) {
					board[i][j] = 0;
				}
				if(board[i][j] == 0 && count == 3) {
					board[i][j] = 1;
				}
			}
		}

	}
}
