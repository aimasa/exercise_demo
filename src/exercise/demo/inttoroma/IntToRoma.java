package exercise.demo.inttoroma;


public class IntToRoma {
    public String intToRoma(int num) {
        int[] numIndex = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        String[] numRoma = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
        StringBuffer resultRoma = new StringBuffer();
        int index = 0;
        for (int i = 0; i < numIndex.length; i++) {
            index = num / numIndex[i];
            num = num % numIndex[i];
            for (int j = index; j > 0; j--) {
                resultRoma.append(numRoma[i]);
            }
        }
        return resultRoma.toString();

    }
}
