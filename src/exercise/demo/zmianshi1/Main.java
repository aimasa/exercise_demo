package exercise.demo.zmianshi1;

import java.util.*;



public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] tmp =sc.nextLine().split(" ");
        int[] num = new int[tmp.length];
        for(int i = 0; i < tmp.length; i++){
            if(tmp[i].length() == 0){
                continue;
            }
            num[i] = Integer.valueOf(tmp[i]);
        }
        int n = num[0];
        int m = num[1];
        int p = num[2];
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for(int i = 0; i < m; i++){
            String[] num2 = sc.nextLine().split(" ");
            List<Integer> list = map.getOrDefault(Integer.valueOf(num2[0]), new ArrayList<>());
            list.add(Integer.valueOf(num2[1]));
            map.put(Integer.valueOf(num2[0]), list);
        }
        findNum(map, p, n);
    }
    public static void findNum(HashMap<Integer, List<Integer>> map, int p, int n){
        int index = subStepNum(p, map);
        for(int i = 1; i <= n - index; i++){
            System.out.print(i + " ");
        }
    }
    public static int subStepNum(int startIndex, HashMap<Integer, List<Integer>> map){
        if(!map.containsKey(startIndex) || map.get(startIndex).size() == 0){
            return 0;
        }
        List<Integer> indexs = map.get(startIndex);
        int subStepNum = 0;
        for(int tmp : indexs){
            subStepNum = Math.max(subStepNum, subStepNum(tmp, map));
        }
        return subStepNum + 1;
    }
}
