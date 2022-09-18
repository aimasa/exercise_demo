package exercisedemo;

import java.util.*;


public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     * 找到输入字符串中连续不含重复字符的最长子串。如果有多个相同长度的，只需取第一个。
     * @param str string字符串 非空字符串
     * @return string字符串
     */
    public String findMaxSubstr (String str) {
        // write code here
        HashMap<Character, Integer> map = new HashMap<>();
        char[] sToChar = str.toCharArray();
        int left = 0;
        int right = 0;
        int max = 0;
        int[] index = new int[2];
        while(left < sToChar.length){
            while(right < sToChar.length && (!map.containsKey(sToChar[right]) || map.get(sToChar[right]) < left)){
                map.put(sToChar[right], right);
                right++;
            }
            if(max < (right - left)){
                max = right - left;
                index[0] = left;
                index[1] = right;
            }
            if(right >= sToChar.length){
                break;
            }
            left = map.get(sToChar[right]) + 1;
        }
        return str.substring(index[0], index[1]);
    }
}