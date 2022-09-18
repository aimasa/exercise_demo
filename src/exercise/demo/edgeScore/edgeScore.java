package exercise.demo.edgeScore;

import java.util.HashMap;

public class edgeScore {
    public int edgeScore(int[] edges) {
        int ans = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < edges.length; i++){
            int count = i;
            if(map.containsKey(edges[i])){
                count += map.get(edges[i]);
            }
            map.put(edges[i], count);
                if(count > map.getOrDefault(ans, 0)){
                ans = i;
            }else if(count == map.getOrDefault(ans, 0)){
                ans = Math.min(i , ans);
            }
        }
        return ans;

    }
}
