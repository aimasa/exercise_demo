package exercise.demo.weekly;

import exercise.demo.zbishi.简单.Main;

import java.util.HashMap;

public class MaxVowels {
    public int maxVowels(String s, int k) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('a', 1);
        map.put('e', 2);
        map.put('i', 3);
        map.put('o', 3);
        map.put('u', 4);
        char[] chars = s.toCharArray();
        int[] dp = new int[chars.length];
        for(int i = 0; i < chars.length; i++){
            if(map.containsKey(chars[i])){
                dp[i] = 1;
            }
        }
        int max = 0;

        for(int i = k - 1; i < chars.length; i++){
            int index = i - k + 1;
            int sum = 0;
            int gap = 0;
            while (gap < k){
                sum += dp[index];
                index++;
                gap++;
            }
            max = Math.max(max, sum);
        }
        return max;


    }

    public static void main(String[] args) {
        new MaxVowels().maxVowels("abciiidef", 3);
    }
}
