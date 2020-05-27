package exercise.demo.lastremaining;

import java.util.ArrayList;
import java.util.List;

import javax.naming.InitialContext;

public class lastremaining {
    public int lastRemaining(int n, int m) {
    	List<Integer> roll = new ArrayList<Integer>();
    	for(int i = 0; i < n; i++) {
    		roll.add(i);
    	}
    	int index = 0;
    	while (roll.size() > 1) {
    		index += (m-1);
    		if(index >= roll.size()) {
    			index -= roll.size();
    		}
    		roll.remove(index);
		}
		return roll.get(0);
    	
    }
}
