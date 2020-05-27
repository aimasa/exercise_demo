package exercise.demo.countcharacters;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountCharacters {
	public int countCharacters(String[] words, String chars) {
    	int sum = 0;
    	String[] arrayList = chars.split("");
    	List<String> list = new ArrayList<String>();
        list = Arrays.asList(arrayList);    	
        for(int i = 0; i < words.length; i++){
        	int count = 0;
        	List<String> tempList = new ArrayList<String>(list);
            for(int j = 0; j < words[i].length(); j++) {
            	if(!tempList.contains(String.valueOf(words[i].charAt(j)))) {
            		count = 0;
            	    break;
            	}
            	tempList.remove(String.valueOf(words[i].charAt(j)));
				count++;
            }
            sum += count;
        }
		return sum;
}
}
