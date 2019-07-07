package exercise.demo.myatoi;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyAtoi {
    public int myAtoi(String str) {
        str = str.trim();
        String pattern="^[\\+\\-\\d]\\d*";//正则表达式，表示以正号或负号或数字开头，且后面是0个或多个数字
        Pattern p=Pattern.compile(pattern);
        Matcher matcher=p.matcher(str);
//        String p = "^[\\+\\-\\d]\\d*";
//        Pattern pattern = Pattern.compile(p);
//        Matcher matcher = pattern.matcher(noSpaceStr);
        String newStr = "";
        if (matcher.find()) {
            newStr = str.substring(matcher.start(), matcher.end());
        } else {
            return 0;
        }
        if (newStr.length() == 1 || newStr == "-" || newStr == "+") {
            return 0;
        }
        try {
            int resultInt = Integer.parseInt(newStr);
            return resultInt;
        } catch (Exception e) {
            return newStr.charAt(0) == '-' ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        }

        // String newStr = str.trim();
        // String resultStr = "";
        // int i = 0;
        // if(Character.toString(newStr.charAt(i)) == "-" ||
        // Character.toString(newStr.charAt(i)) == "+") {
        // resultStr = resultStr + Character.toString(newStr.charAt(i));
        // i++;
        // }
        // while(i < newStr.length()) {
        // if(newStr.charAt(i) < 48 || newStr.charAt(i) > 57) {
        // break;
        // }
        // resultStr = resultStr + Character.toString(newStr.charAt(i));
        // }
        // if(Long.valueOf(resultStr)>Integer.MAX_VALUE) return
        // Integer.MAX_VALUE;
        // if(Long.valueOf(resultStr)<Integer.MIN_VALUE) return
        // Integer.MIN_VALUE;
        // return Integer.valueOf(resultStr);

    }
}
