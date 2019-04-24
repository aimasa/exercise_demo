package exercise.demo.lengthoflongestsubstring;

import java.util.Set;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Solution {
	public int lengthOfLongestSubstring(String s) {
//	Set<Character> set = new HashSet<>();
//		int length = s.length();
//	int i = 0;
//	int j = 0;
//		int ans = 0;
//	while(i < length && j < length) {
//		if(!set.contains(s.charAt(j))) {//对j指向的元素判断是否被包含
//			set.add(s.charAt(j++));
//			ans = Math.max(ans, j-i);
//			
//		}else {//j指向的元素没有被包含时候，移除最前面的i，但是j不变，会返回去再判断一次。
//			set.remove(s.charAt(i++));
//		}
//	}
//	return ans;
//	
		int ans = 0;
		int length = s.length();
		Map<Character, Integer> set = new HashMap<>();
		for (int i = 0, j = 0; j < length; j++) {
			if (set.containsKey(s.charAt(j))) {
				i = Math.max(set.get(s.charAt(j)), i);//i永远指向存在相同元素的位置的前一位，因为后面还会对该元素对应的位置进行更改。
			} 
				set.put(s.charAt(j), j+1);
				ans = Math.max(ans, j - i + 1);
			}
		return ans;
	}
}
