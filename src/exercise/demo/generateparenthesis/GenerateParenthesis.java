package exercise.demo.generateparenthesis;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<String>();
        generate(result, "", 0, 0, n);
        return result;
    }

    private void generate(List<String> stringList, String s, int rightCount, int leftCount, int n) {
        if (rightCount < n && rightCount > leftCount) {
            generate(stringList,s + "(",  rightCount + 1, leftCount, n);
            generate(stringList, s + ")", rightCount, leftCount + 1, n);
        }else if(rightCount < n && leftCount == rightCount){
            generate(stringList, s + "(", rightCount + 1, leftCount, n);
        }else if(rightCount == n) {
            for(int i = 0; i < n - leftCount; i++) {
                s = s + ")";
            }
            stringList.add(s);
        }

    }
}
