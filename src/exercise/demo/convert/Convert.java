package exercise.demo.convert;

import java.util.ArrayList;
import java.util.List;

public class Convert {
    public String convert(String s, int numRows) {
        if(numRows == 1) {
            return s;
        }
        int curRaw = 0;
        Boolean isAdd = false;
        List<StringBuffer> strRaw = new ArrayList<StringBuffer>();
        for(int i = 0; i < Math.min(numRows, s.length()); i++) {
            strRaw.add(new StringBuffer());
        }
        String resultStr = "";
        for(int i = 0; i < s.length(); i++) {
            strRaw.get(curRaw).append(s.charAt(i));
            if(curRaw == 0 || curRaw == (numRows - 1)) {
                isAdd = !isAdd;
            }
            curRaw += isAdd?1:-1;
        }
        StringBuffer sb = new StringBuffer();
        for(StringBuffer sBuffer :strRaw) {
            sb.append(sBuffer);
        }
        return sb.toString();

    }
}
