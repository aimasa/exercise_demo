package exercise.demo.weekly;

import java.util.HashMap;
import java.util.List;

public class DestCitydestCity {
    public String destCity(List<List<String>> paths) {
        HashMap<String, String> record = new HashMap<>();
        for(int i = 0; i < paths.size(); i++){
            List<String> path = paths.get(i);
            record.put(path.get(0), path.get(0));
        }

            String start = record.get(paths.get(0).get(0));
        while (record.containsKey(start)){
            start = record.get(start);
        }
        return start;


    }}
