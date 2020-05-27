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
//		if(!set.contains(s.charAt(j))) {//��jָ���Ԫ���ж��Ƿ񱻰���
//			set.add(s.charAt(j++));
//			ans = Math.max(ans, j-i);
//			
//		}else {//jָ���Ԫ��û�б�����ʱ���Ƴ���ǰ���i������j���䣬�᷵��ȥ���ж�һ�Ρ�
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
				i = Math.max(set.get(s.charAt(j)), i);
			} 
				set.put(s.charAt(j), j+1);
				ans = Math.max(ans, j - i + 1);
			}
		return ans;
	}
}
