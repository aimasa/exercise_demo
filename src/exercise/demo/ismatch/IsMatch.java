package exercise.demo.ismatch;

public class IsMatch  {
    public boolean isMatch(String s, String p) {
        int sLen = s.length();
        int pLen = p.length();
        boolean[][] dp = new boolean[sLen][pLen];
        if(p.charAt(0) == '*'||p.charAt(0) == s.charAt(0)){
            dp[0][0] = true;
        }
        for(int i = 1; i < sLen; i++){
            if(p.charAt(0) != '*'){
                break;
            }
            dp[i][0] = true;
        }
        for(int i = 1; i < pLen; i++){
            dp[0][i] = p.charAt(i) == s.charAt(0);
        }
        for(int j = 1; j < pLen; j++){
            for(int i = 1; i < sLen; i++){
                if(p.charAt(j) == '*'){
                    dp[i][j] = dp[i - 1][j] | dp[i][j - 1];
                }
                else if(s.charAt(i) == p.charAt(j) || p.charAt(j) == '?'){
                    dp[i][j] = dp[i - 1][j - 1];
                }

            }

        }
        return dp[sLen - 1][pLen - 1];

    }

    public static void main(String[] args) {
        new IsMatch().isMatch("adcebabd","*ab*d");
    }
}
