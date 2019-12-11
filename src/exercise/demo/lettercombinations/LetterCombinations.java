package exercise.demo.lettercombinations;

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

    public List<String> letterCombinations(String digits) {
        strList("",digits);
        return finalResult;

    }
    private void strList(String tempList, String nextDigits){
        if(nextDigits.length() == 0) {

            if(tempList.length() != 0) {finalResult.add(tempList);}
        }
        else {  
            String digit = nextDigits.substring(0,1);
            String letter = numMap.get(digit);
            for(int i = 0; i < letter.length(); i++) {
                String letterStr = Character.toString(letter.charAt(i));
                strList(tempList + letterStr, nextDigits.substring(1));
            }
        }
        
    }
}
