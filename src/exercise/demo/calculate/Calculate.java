package exercise.demo.calculate;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Calculate {
    public int calculate(String s) {
        int flag = 1;
        List<Integer> stack = new ArrayList<>();
        s = s.trim();
        if(s.length() == 0){
            return 0;
        }
        char[] c = s.toCharArray();
        int lastNum = 0;
        for (int i = 0; i < c.length; i++) {
            if (c[i] == ' ') {
                continue;
            }
            int num = c[i] - '0';
            if (num < 10 && num >= 0) {
                lastNum = lastNum * 10 + num;
            } else {
                if (c[i] == '*' || c[i] == '/') {
                    int nextNum = 0;
                    int index = i;
                    i++;
                    while (c[i] == ' '){
                        i++;
                    }
                    while (i < c.length && c[i] - '0' < 10 && c[i] - '0' >= 0) {
                        nextNum = nextNum * 10 + (c[i] - '0');
                        i++;
                        while (i < c.length && c[i] == ' '){
                            i++;
                        }
                    }
                    if (c[index] == '*') {
                        lastNum = lastNum * nextNum;
                    } else {
                        lastNum = lastNum / nextNum;
                    }
                    i--;
                } else {

                    stack.add(flag * lastNum);
                    if(c[i] == '-'){
                        flag = -1;
                    }else{
                        flag = 1;
                    }
                    lastNum = 0;
                }

            }
        }
        stack.add(flag * lastNum);
        int result = 0;
        for(int tmp : stack){
            result += tmp;
        }
        return result;
    }

    public static void main(String[] args) {
        new Calculate().calculate(" 3+5 / 2 -6 + 7/2-1");
    }
}
