package exercise.demo.ladderlength;

import java.util.*;

public class LadderLength {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        int length = beginWord.length();
        if(!wordList.contains(endWord)){
            return 0;
        }
        HashMap<String, List<String>> map = new HashMap<>();
        for(String list : wordList){
            for(int i = 0; i < length; i++){
                String re = list.substring(0, i) + "*" + list.substring(i + 1, length);
                List<String> tmp = map.getOrDefault(re, new ArrayList<>());
                tmp.add(list);
                map.put(re, tmp);
            }
        }


        Queue<String> queBegin = new LinkedList<>();
        Queue<String> queEnd = new LinkedList<>();
        queBegin.add(beginWord);
        queEnd.add(endWord);
        int count = 0;
        while(queEnd != null && endWord != null){
            if(queEnd.size() < queBegin.size()){
                Queue<String> tmp = queBegin;
                queBegin = queEnd;
                queEnd = tmp;
            }
            for(int i = 0; i < queBegin.size(); i++){
                String firstQue = queBegin.poll();
                if(queEnd.contains(firstQue)){
                    return count + 1;
                }
                for(int j = 0; j < length; j++){
                    String re = firstQue.substring(0, j) + "*" + firstQue.substring(j + 1, length);
                    List<String> result = map.get(re);
                    queBegin.addAll(result);

                }
            }
            count++;
        }
        return count;
    }
}