package exercise.demo.longestcommonprefix;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        int minLength = 1;
        int index = 0;
        if(strs == null || strs.length == 0){
            return "";
        }
        int maxIndex = strs[0].length();
            for(int i = 0; i < strs.length; i++){
                int tempIndex = 0;
                maxIndex = maxIndex > strs[i].length() ? strs[i].length() : maxIndex;
                while(tempIndex < maxIndex) {
                if(strs[0].charAt(tempIndex) != strs[i].charAt(tempIndex)){
                    maxIndex = tempIndex;   
                    break;
                }
                tempIndex++;
            }}
            return strs[0].substring(0, maxIndex);
        
    }

}
