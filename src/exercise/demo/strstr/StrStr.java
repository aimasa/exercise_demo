package exercise.demo.strstr;


public class StrStr {
    public int strStr(String haystack, String needle) {
        if (haystack.length() <= 0) {
            return 0;
        }
        if (needle.length() <= 0 || needle.length() > haystack.length()) {
            return -1;
        }
        int headHaystack = 0;
        int haystackKey = 0;
        int needleKey = 0;
        while (haystackKey< haystack.length() && needleKey < needle.length()) {
            if(haystack.charAt(haystackKey) == needle.charAt(needleKey)) {
                haystackKey++;
                needleKey++;
            }else {
                needleKey = 0;
                haystackKey = headHaystack + 1;
                headHaystack ++;
            }
        }
        if(needleKey == needle.length()){
            return headHaystack;
        }
        return 0;

    }
//    public int[] getNext(String needle) {
//        char[] needleList = needle.toCharArray();
//        int[] index = new int[needleList.length];
//        for(int i = 0; i < needleList.length; i++) {
//            
//        }
//        return null;}
}
