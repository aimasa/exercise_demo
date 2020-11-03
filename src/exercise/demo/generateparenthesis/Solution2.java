package exercise.demo.generateparenthesis;

import java.util.ArrayList;
import java.util.List;

public class Solution2 {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generate(0,0,n, new StringBuffer(), result);
        return result;


    }
    public void generate(int left, int right, int n, StringBuffer entire, List<String> result){
        if(entire.length() == n * 2){
            result.add(entire.toString());
            return;
        }
        if(left < n){
            entire.append("(");
            generate(left + 1, right, n, entire, result);
            entire.deleteCharAt(entire.length() - 1);
        }
        if(right < left){
            entire.append(")");
            generate(left, right + 1, n, entire, result);
            entire.deleteCharAt(entire.length() - 1);
        }
    }
}
