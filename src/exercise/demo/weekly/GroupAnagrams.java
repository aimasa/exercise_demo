package exercise.demo.weekly;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(int i = 0; i < strs.length; i++){
            char[] key = strs[i].toCharArray();
            Arrays.sort(key);
            String str = String.valueOf(key);
            if(!map.containsKey(str)){
                map.put(str, new ArrayList<>());
            }
                map.get(str).add(strs[i]);
        }
        return new ArrayList<>(map.values());
    }
}
