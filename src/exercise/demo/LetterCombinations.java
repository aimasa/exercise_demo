package exercise.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinations {
    List<String> finalResult = new ArrayList<String>();
    Map<String, String> numMap = new HashMap<String, String>() {
        {
            put("2", "abc");
            put("3", "def");
            put("4", "ghi");
            put("5", "jkl");
            put("6", "mno");
            put("7", "pqrs");
            put("8", "tuv");
            put("9", "wxyz");
        }
    };

//    public List<String> letterCombinations(String digits) {
//
//    }
//    public List<String> connect(String digits, int left){
//
//
//    }
}
