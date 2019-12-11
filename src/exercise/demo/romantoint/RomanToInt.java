package exercise.demo.romantoint;

public class RomanToInt {
    public int romanToInt(String s) {
        int[] numIndex = { 1000, 500, 100, 50, 10, 5, 1 };
        char[] numRoma = { 'M', 'D', 'C', 'L', 'X', 'V', 'I' };
        int index = 0;
        int resultNum = 0;
        int sIndex = 0;
        while (sIndex < s.length() && index <= numRoma.length) {
            if (index > 0 && sIndex <= s.length()-1 && s.charAt(sIndex) == 'I' && s.charAt(sIndex - 1) != 'I') {
                resultNum = numIndex[index - 1] - resultNum;
                sIndex = sIndex + 2;
            }
            if (index < numRoma.length && s.charAt(sIndex) == numRoma[index]) {
                int n = 1;
                for (int i = sIndex + 1; i < s.length(); i++) {
                    if (s.charAt(sIndex) == s.charAt(i)) {
                        n++;
                    } else {
                        break;
                    }
                }
                resultNum = resultNum + numIndex[index] * n;
                sIndex = sIndex + n;
            }
            index = index + 1;
        }
        return resultNum;

    }
}
