package exercise.demo.weekcom;

import java.util.HashMap;
import java.util.List;

public class Reformat {
    public String reformat(String s) {
        char[] c = s.toCharArray();
        int length = c.length;
        char[] result = new char[length];
        int indexNum = 0;
        int indexChar = length - 1;
        int count = 0;
        int charIndex = 0;
        for(int i = 0; i < length; i++){
            if(c[i] >= 48 && c[i] <= 57){
                count++;
                result[indexNum] = c[i];
                indexNum++;
            }
            else{
                result[indexChar] = c[i];
                count--;
                indexChar--;
            }

        }
        if(count > 1 || count < -1){
            return "";
        }
        indexNum = 0;
        indexChar = length - 1;
        StringBuffer sb = new StringBuffer();
        while(indexNum < indexChar){

            if(count >= 0){
                sb.append(result[indexNum]);
                sb.append(result[indexChar]);
                System.out.print(result[indexChar]);
            }
            else{
                sb.append(result[indexChar]);
                sb.append(result[indexNum]);
            }


            indexNum++;
            indexChar--;
            if(indexNum == indexChar){
                sb.append(result[indexChar]);
                break;
            }
        }
        return sb.toString();

}

    HashMap<String, List<String>> table = new HashMap<>();
}
