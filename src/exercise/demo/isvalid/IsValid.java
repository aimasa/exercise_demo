package exercise.demo.isvalid;

public class IsValid {
    public boolean isValid(String s) {
        StringBuffer dsb = new StringBuffer();
        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                dsb.append(s.charAt(i));
                index = index + 1;
                continue;
            }
            if(dsb.length() == 0) {
                return false;
            }
            if(s.charAt(i) == ']') {
                if(dsb.charAt(index - 1) != '[') {
                    return false;
                }
            }else if(s.charAt(i) == '}') {
                if(dsb.charAt(index - 1) != '{') {
                    return false;
                }
            }else if(s.charAt(i) == ')'){
                if(dsb.charAt(index - 1) != '(') {
                    return false;
                }
            }
            dsb.delete(index - 1,index);
            index = index - 1;
        }
        if(dsb.length() ==0) {
            return true;
        }
        return false;
        
    }
}
