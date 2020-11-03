package exercise.demo.minwindow;

import java.util.HashMap;

public class MinWindow {
    public String minWindow(String s, String t) {
        char[] tc = t.toCharArray();
        HashMap<Character, Integer> set = new HashMap<>();
        int count = 0;
        HashMap<Character, Integer> tmp = new HashMap<>();
        for(int i = 0; i < tc.length; i++){
            set.put(tc[i], 0);
            tmp.put(tc[i], tmp.getOrDefault(tc[i], 0) + 1);
        }
        char[] sc = s.toCharArray();
        int left = 0;
        int right = 0;
        int length = Integer.MAX_VALUE;
        int lastLeft = 0;
        int lastRight = 0;
        while(right <= sc.length){
            while(left < sc.length - tc.length + 1){
                System.out.println("left : " + left);
                if(set.containsKey(sc[left])){
                    System.out.println(sc[left]);
                    System.out.println("count : " + count);
                    break;
                }
                left++;
            }
            if(right < left){
                right = left;
            }
            while(right < sc.length && count < tc.length){
                if(set.containsKey(sc[right])){
                    if(set.get(sc[right]) < tmp.get(sc[right])){
                        count++;
                    }
                    System.out.println("count : " + count);
                    set.put(sc[right], set.get(sc[right]) + 1);
                }
                right++;
            }

            if(count != tc.length){
                break;
            }

            if(length > right - left){
                lastLeft = left;
                lastRight = right;
                length = right - left;
            }
            if(left >= sc.length - tc.length + 1){
                break;
            }
            if(set.get(sc[left]) < tmp.get(sc[left]) + 1){
                count--;
            }
            set.put(sc[left], set.get(sc[left]) - 1);
            left++;
        }
        return s.substring(lastLeft, lastRight);

    }

    public static void main(String[] args) {
        String str = new MinWindow().minWindow("bbaa", "baa");
        System.out.println(str);
    }
}