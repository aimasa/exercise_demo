package exercise.demo.exist;
//给定一个二维网格和一个单词，找出该单词是否存在于网格中。
//
//        单词必须按照字母顺序，通过相邻的单元格内的字母构成，其中“相邻”单元格是那些水平相邻或垂直相邻的单元格。同一个单元格内的字母不允许被重复使用


import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

//board =
//        [
//        ['A','B','C','E'],
//        ['S','F','C','S'],
//        ['A','D','E','E']
//        ]
//
//        给定 word = "ABCCED", 返回 true
//        给定 word = "SEE", 返回 true
//        给定 word = "ABCB", 返回 false
public class Exist  {
    int[][] indexBia = new int[][]{{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
    Boolean flag = false;
    public boolean exist(char[][] board, String word){
        char[] wordToChar = word.toCharArray();
        int index = 0;
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){

                if(board[i][j] == wordToChar[0]){
                    isReal(board, wordToChar, i, j, 1);
                }
                if(flag){
                    return true;
                }
            }
        }
        return false;
    }

    public void isReal(char[][] board, char[] wordToChar, int x, int y, int start){
        if(start == wordToChar.length){
            flag = true;
            return;
        }
        for(int[] index : indexBia){
            if(flag){
                return;
            }
            int nowX = x + index[0];
            int nowY = y + index[1];
            if(isLimit(nowX, nowY, board) && board[nowX][nowY] == wordToChar[start]){
                isReal(board, wordToChar, nowX, nowY, start + 1);
            }
        }


    }
    public Boolean isLimit(int x, int y, char[][] board){
        return x < board.length && y < board[0].length && x >= 0 && y >= 0;
    }
}
