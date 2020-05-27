package exercise.demo.longestpalindrome;

import java.util.Arrays;

public class newLongestPalindrome {
    public int longestPalindrome(String s) {
        int[] result = new int[60];
        s.charAt(2);
        char[] chars = s.toCharArray();
        for(int i = 0; i < s.length(); i++){
        		result[chars[i] - 'A'] += 1;
        }
        int count = 0;
        for(int i = 0; i < 60; i++){
            if(result[i] >= 2){
                count += result[i] - result[i] % 2;
            }
        }
        if(count == s.length()){
            return count;
        }
        return count + 1;
    }
}
