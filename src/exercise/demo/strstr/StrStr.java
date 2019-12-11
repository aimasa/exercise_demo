package exercise.demo.strstr;

public class StrStr {
    public int strStr(String haystack, String needle) {
        char[] haystackChar = haystack.toCharArray();
        char[] needleChar = needle.toCharArray();
        int[] next = getNext(needle);
        return 0;
        
    }
    public int[] getNext(String needle) {
       // 因为前面需要比较的子字符串已经比较过了是相等的，所以下一个跳转位置就能够从匹配字符串中得到。懂吧懂吧，晚上回来写完 
        return null;
        
    }
}
