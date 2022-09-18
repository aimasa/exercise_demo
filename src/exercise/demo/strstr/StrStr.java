package exercise.demo.strstr;

import java.nio.charset.spi.CharsetProvider;

public class StrStr {
    public int strStr(String haystack, String needle) {
        char[] haystackChar = haystack.toCharArray();
        char[] needleChar = needle.toCharArray();
        int[] next = getNext(needle);
        return 0;

    }

    public int[] getNext(String needle) {
        // 因为前面需要比较的子字符串已经比较过了是相等的，所以下一个跳转位置就能够从匹配字符串中得到。懂吧懂吧，晚上回来写完
        char[] needleChar = needle.toCharArray();
        for (int i = 0; i < needle.length(); i++) {
            

        }
        return null;

    }
}
