package exercise.demo.ispalindrome;

public class IsPalindrome {
    public boolean isPalindrome(int x) {
//        if (x < 0) {
//            return false;
//        }
//        String resultStr = "";
//        // return Integer.reverse(x) == x? true:false;
//        String str = Integer.toString(x);
//        String tempStr = str.substring((str.length() - 1) / 2 + 1,
//                str.length());
//        if ((str.length() - 1) % 2 == 0) {
//            for(int i = tempStr.length() - 1 ; i >= 0 ; i--) {
//                resultStr = resultStr + tempStr.charAt(i);
//            }
//            return str.substring(0, (str.length() - 1) / 2).equals(resultStr) ? true : false;
//        } else {
//            for(int i = tempStr.length() - 1 ; i >= 0 ; i--) {
//                resultStr = resultStr + tempStr.charAt(i);
//            }
//            return str.substring(0, (str.length() - 1) / 2 + 1).equals(resultStr) ? true : false;
//        }

        if(x < 0) {return false;}
        int resultX = 0;
        int tempX = x;
        while(tempX != 0) {
            resultX = resultX * 10 + tempX % 10;
            tempX = tempX / 10;
        }
        return resultX == x?true:false;
    }
}
