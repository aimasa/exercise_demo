package exercise.demo.longestpalindrome;

public class Solution2 extends Solution{
    public String longestPalindrome(String s) {
        StringBuffer sb = new StringBuffer();
        char[] sChar = s.toCharArray();
        sb.append("#");
        for(int i = 0; i < sChar.length; i++) {
            sb.append(sChar[i]);
            sb.append("#");
        }
        char[] predChar = sb.toString().toCharArray();
        int maxIndex = 0;
        int ci = 0;
        int[] dp = new int[predChar.length];
        dp[0] = 1;
        for(int j = 1; j < predChar.length; j++) {
            int l = 1;
            if(j < ci + dp[ci]) {
                int i = 2 * ci - j;
                if(i - dp[i] > ci - dp[ci]) {
                    dp[j] = dp[i];
                    continue;
                }else{
                    l = i - ci + dp[ci];
                }
            }
            while(j - l >= 0 && j + l < predChar.length && predChar[j + l] == predChar[j - l]) {
                l++;
            }
            dp[j] = l;
            if(dp[maxIndex] < l) {
                maxIndex = j;
            }
            if(j + l > ci + dp[ci]) {
                ci = j;
            }
        }
        return new String(predChar).substring(maxIndex - dp[maxIndex] + 1, maxIndex + dp[maxIndex] - 1).replace("#", "");
        

    }
}
