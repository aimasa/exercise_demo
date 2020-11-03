package exercise.demo.findwords;

import java.util.*;

public class FindWords {
    public List<String> findWords(char[][] board, String[] words) {
        HashMap<Character, List<int[]>> map = new HashMap<>();
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                List<int[]> index = map.getOrDefault(board[i][j], new ArrayList<>());
                index.add(new int[]{i, j});
                map.put(board[i][j], index);
            }
        }
        List<String> result = new ArrayList<>();
        for(int i = 0; i < words.length; i++){
            if(!map.containsKey(words[i].charAt(0))){
                continue;
            }
            char[] wordChar = words[i].toCharArray();
            List<int[]> indexs = map.get(wordChar[0]);
            for(int[] index : indexs){
                boolean[][] path = new boolean[board.length][board[0].length];

                if(subTask(board, index, wordChar, 0, path)){
                    result.add(words[i]);
                    break;
                }
            }
        }
        return result.size() == 0 ? null : result;
    }
    public Boolean subTask(char[][] board, int[] index, char[] word, int start, boolean[][] path){
        if(start >= word.length - 1){
            return true;
        }
        int x = index[0];
        int y = index[1];
        Boolean result = false;
        path[x][y] = true;
        if(x > 0 && !path[x - 1][y] && board[x - 1][y] == word[start + 1]){
            result = result || subTask(board, new int[]{x - 1,y}, word, start + 1, path);
        }
        if(x < board.length - 1 && !path[x + 1][y] && board[x + 1][y] == word[start + 1]){
            result = result || subTask(board, new int[]{x + 1,y}, word, start + 1, path);
        }
        if(y > 0 && !path[x][y - 1] &&  board[x][y - 1] == word[start + 1]){
            result = result || subTask(board, new int[]{x,y - 1}, word, start + 1, path);
        }
        if(y < board[0].length - 1 && !path[x][y + 1] && board[x][y + 1] == word[start + 1]){
            result = result || subTask(board, new int[]{x,y + 1}, word, start + 1, path);
        }
        path[x][y] = false;
        return result;
    }

}