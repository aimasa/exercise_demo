package exercise.demo.numrookcaptures;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.swing.border.Border;

import exercise.demo.longestpalindrome.newLongestPalindrome;

public class NumRookCaptures {
	public int numRookCaptures(char[][] board) {
		int[] rook = new int[2];
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				if (board[i][j] == 'R') {
					rook[0] = i;
					rook[1] = j;
				}
			}
		}
		int left = rook[0];
		int right = rook[0];
		int up = rook[1];
		int down = rook[1];
		int result = 0;
        for(int i = rook[0]; i > 0; i--) {
        	if(board[i][rook[1]] == 'B' || board[i][rook[1]] == 'P') {
        		break;
        	}
        	if(board[i][rook[1]] == 'p') {
        		result += 1;
        		break;
        	}
        }
        for(int i = rook[0]; i < board.length; i++) {
        	if(board[i][rook[1]] == 'B' || board[i][rook[1]] == 'P') {
        		break;
        	}
        	if(board[i][rook[1]] == 'p') {
        		result += 1;
        		break;
        	}
        }
        for(int i = rook[1]; i > 0; i--) {
        	if(board[rook[0]][i] == 'B' || board[rook[0]][i] == 'P') {
        		break;
        	}
        	if(board[rook[0]][i] == 'p') {
        		result += 1;
        		break;
        	}
        }
        for(int i = rook[1]; i < board[0].length; i++) {
        	if(board[rook[0]][i] == 'B' || board[rook[0]][i] == 'P') {
        		break;
        	}
        	if(board[rook[0]][i] == 'p') {
        		result += 1;
        		break;
        	}
        }
		return result;
	}

}
