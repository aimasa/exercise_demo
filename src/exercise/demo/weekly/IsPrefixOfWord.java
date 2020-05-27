package exercise.demo.weekly;

public class IsPrefixOfWord {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] strs = sentence.split(" ");
        int length = strs.length;
        for(int i = 0; i < length; i++){
            if(strs[i].length() < searchWord.length()){
                continue;
            }
            String temp = strs[i];
            int strsLength = temp.length();
            int searchLength = searchWord.length();
            int left = 0;
            while(left < searchLength){
                if(temp.charAt(left) != searchWord.charAt(left)){
                    break;
                }
                left++;
            }
            System.out.println("strs[i]:" + temp);
            System.out.println("left:" + left);
            if(left == strsLength){
                return i + 1;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        new IsPrefixOfWord().isPrefixOfWord("i love eating burger","burg");
    }
}
