package exercise.demo.romatoint;

public class RomaToInt {
    public int romanToInt(String s) {
    	int resultNum = 0;
    	int[] numIndex = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        String[] numRoma = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
        int index = 0;
        for(int i = 0; i < numRoma.length; i++) {
        		 int num = 0;
        		 while(index + 1 < s.length() && numRoma[i].equals(s.substring(index, index + 2))) {
        			 num = num + 1;
        			 index = index + 2;
        			 resultNum = resultNum + numIndex[i];
        		 }
        		 while(index < s.length() && numRoma[i].equals(s.substring(index, index + 1))) {
        			 num = num + 1;
        			 index = index + 1;
        			 resultNum = resultNum + numIndex[i];
        		 }
         }
		return resultNum;
    	
        
    }
}
