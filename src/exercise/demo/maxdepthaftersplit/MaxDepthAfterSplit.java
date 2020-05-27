package exercise.demo.maxdepthaftersplit;

import java.util.Arrays;
import java.util.Stack;

import exercise.demo.longestpalindrome.newLongestPalindrome;

public class MaxDepthAfterSplit {
    public int[] maxDepthAfterSplit(String seq) {
    	Stack<Character> deepSeq =  new Stack<Character>();
    	char[] seqChar = seq.toCharArray();
    	int[] result = new int[seqChar.length];
    	int d = 0;
    	for(int i = 0; i < seqChar.length; i++) {
    		if(seqChar[i] == '(') {
    			d++;
    			result[i] = d % 2;
    		}
    		if(seqChar[i] == ')') {
    			result[i] = d % 2;
    			d--;
    		}
    	}
		return result;
    }
}
