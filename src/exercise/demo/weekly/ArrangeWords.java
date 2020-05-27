package exercise.demo.weekly;

public class ArrangeWords {
    public String arrangeWords(String text) {
        StringBuffer sb = new StringBuffer();
        StringBuffer[] strNum = new StringBuffer[100001];
        String[] textNum = text.split(" ");
        for(int i = 0; i < textNum.length; i++){
            String temp = textNum[i];
            if(strNum[temp.length() - 1] == null){
                strNum[temp.length() - 1] = new StringBuffer(temp);
            }else{
            strNum[temp.length() - 1].append(temp.toLowerCase());}
            strNum[temp.length() - 1].append(" ");
        }
        for(int i = 0; i < 100001; i++){
            if(strNum[i] == null){
                continue;
            }
            sb.append(strNum[i]);
        }
        sb.replace(0, 1, String.valueOf(sb.charAt(0)).toUpperCase());
        return sb.toString().trim();

    }

    public static void main(String[] args) {
        new ArrangeWords().arrangeWords("To be or not to be");
    }
}
