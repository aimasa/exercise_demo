package exercise.demo.mindistance;

public class MinDistance {
    public int minDistance(String word1, String word2) {
    	char[] word1Chars = word1.toCharArray();
    	char[] word2Chars = word2.toCharArray();
    	
    	int[][] dp = new int[word1Chars.length + 1][word2Chars.length + 1];
    	
    	for(int i = 0;i < word1Chars.length; i++) {
    		dp[i][0] = i;
    	}
    	for(int i = 0; i < word2Chars.length; i++) {
    		dp[0][i] = i;
    	}
    	for(int i = 0; i < word1Chars.length; i++) {
    		for(int j = 0; j < word2Chars.length; j++) {
    			if(word1Chars[i] != word2Chars[j]) {
    				dp[i + 1][j + 1] = Math.min(Math.min(dp[i][j], dp[i][j + 1]), dp[i + 1][j]) + 1;
    			}
    			else {
    				dp[i + 1][j + 1] = Math.min(Math.min(dp[i][j], dp[i][j + 1] - 1), dp[i + 1][j] - 1) + 1;
				}
    		}
    	}
		return dp[word1Chars.length][word2Chars.length];
        
    }
}
