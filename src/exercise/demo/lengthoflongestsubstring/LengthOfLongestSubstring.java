package exercise.demo.lengthoflongestsubstring;

import exercise.demo.type.ListNode;

import java.util.*;

public class LengthOfLongestSubstring extends Solution{
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0){
            return 0;
        }
        char[] schar = s.toCharArray();
        int left = 0;
        int max = 0;
        int[] chars = new int[256];
        Arrays.fill(chars,-1);
        for(int i = 0; i < schar.length; i++){
            if(chars[schar[i]] > -1){
                left = Math.max(chars[schar[i]], left) + 1;
            }
            chars[schar[i]] = i;
            max = Math.max(max, i - left + 1);
        }
        return max;
    }
}
