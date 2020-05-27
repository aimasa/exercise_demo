package exercise.demo.minimumlengthencoding;

import java.util.Arrays;

import exercise.demo.longestpalindrome.newLongestPalindrome;

public class MinimumLengthEncoding {
	public int minimumLengthEncoding(String[] words) {
		Trie trie = new Trie();
		Arrays.sort(words, (s1,s2) -> (s1.length() - s2.length()));
		int count = 0;
		for(int i = 0; i < words.length; i++) {
			count += trie.insert(words[i]);
		}
		return count;

	}

}

class TrieNode {
	char value;
	TrieNode[] treeNodes = new TrieNode[26];

	public TrieNode() {
	}
}

class Trie {
	TrieNode trieNode;

	public Trie() {
		trieNode = new TrieNode();
	}

	public int insert(String word) {
		char[] wordArray = word.toCharArray();
		TrieNode corrNode = trieNode;
		Boolean isNew = false;
		for (int i = wordArray.length - 1; i >= 0; i--) {
            int index = wordArray[i] - 'a';
            if(corrNode.treeNodes[index] == null) {
            	isNew = true;
            	corrNode.treeNodes[index] = new TrieNode();
            }
            corrNode = corrNode.treeNodes[index];
		}
		return isNew? wordArray.length + 1: 0;

	}
}
