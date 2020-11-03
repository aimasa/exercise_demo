package exercise.demo.maxprobability;

import java.util.*;

public class MaxProbability {



    public double maxProbability(int n, int[][] edges, double[] succProb, int start, int end) {
        HashMap<Integer,Double>[] maps = new HashMap[100000];
        for(int i = 0; i < edges.length; i++){
            int x = edges[i][0];
            int y = edges[i][1];
            if(maps[x] == null){
                maps[x] = new HashMap<>();
            }
            maps[x].put(y, succProb[i]);
            if(maps[y] == null){
                maps[y] = new HashMap<>();
            }
            maps[y].put(x, succProb[i]);
        }
        return subMaxProbability(maps, start, end);
    }
    public double subMaxProbability(HashMap<Integer,Double>[] maps, int start, int end){
        if(start == end){
            return 1;
        }
        if(maps[start] == null || maps[start].isEmpty()){
            return 0;
        }

        double result = 0;
        Set<Integer> set = new HashSet<>(maps[start].keySet());
        Iterator<Map.Entry<Integer, Double>> innerIter = maps[start].entrySet().iterator();
//        for(Integer key : maps[start].keySet()){
//            maps[start].remove(key);
//        }
//        maps[start].clear();
        Queue<Integer> que = new LinkedList<>();
        while (innerIter.hasNext()) {
            Map.Entry<Integer, Double> entry = innerIter.next();
            double firstProb = entry.getValue();
            if(firstProb == 0){
                continue;
            }
            int tmp = entry.getKey();
            innerIter.remove();
            double endProb = subMaxProbability(maps, tmp, end);
            result = Math.max(result, firstProb* endProb);
//            maps[start].put(tmp, entry.getValue());

        }
        return result;
    }

    public static void main(String[] args) {
        double result = new MaxProbability().maxProbability(3, new int[][]{{0, 1}, {1, 2}, {0, 2}}, new double[]{0.5, 0.5, 0.3}, 0, 2);
        System.out.println(result);
    }

}
