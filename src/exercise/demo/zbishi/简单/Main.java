package exercise.demo.zbishi.简单;

import exercise.demo.zijietiaodong.万万没想到之抓捕孔连顺;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;



public class Main {
    Stack<Integer> left;
    Stack<Integer> k;
    Stack<String> kContent;
    StringBuffer text;
    public Main(){
        left = new Stack<>();
         k = new Stack<>();
        kContent = new Stack<>();
        text = new StringBuffer();
    }
    public void textEdit(int func, int numK, String textNew){
        switch (func){
            case 1:
                add(textNew);
                break;
            case 2:
                dele(numK, false);
                break;
            case 3:
                printText(numK);
                break;
            case 4:
                rollBack();
                break;
            default:
                break;
        }
    }
    public void add(String textNew){
        int kCorr = textNew.length();
        text.append(textNew);
        k.add(kCorr);
        kContent.add("");
    }
    public void dele(int numK, boolean isRoll){
        if(numK > text.length()){
            k.add(numK);
            kContent.add("-1");
            return;
        }
        if(!isRoll){
            k.add(text.length() - numK);
            kContent.add(text.substring(text.length() - numK, text.length()));
        }
            text.delete(text.length() - numK, text.length());


    }
    public void printText(int numK){
        if(text.length() <= numK){
            System.out.println("");
        }
        System.out.println(text.substring(numK - 1, numK));
    }
    public void rollBack(){
        String content = kContent.pop();
        if(k == null || content.equals("-1")){
            return;
        }
        int kCorr = k.pop();
        if(content.equals("")){
            dele(kCorr, true);
        }else{
            text = text.insert(kCorr, content);
        }
    }
    public static void main(String[] args)  throws IOException {
        Main ma = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int n = Integer.valueOf(br.readLine());
       if(n == 0){
           return;
       }

        for(int i = 0; i < n; i++){
            String[] strInt = br.readLine().split(" ");
            int num = Integer.valueOf(strInt[0]);
            if(num == 1){
                String textNew = strInt[1];
                ma.textEdit(num, 0, textNew);
            }
            else if(num == 4){
                ma.textEdit(num, 0, "");
            }
            else {
                int numK = Integer.valueOf(strInt[1]);
                ma.textEdit(num, numK, "");
            }

        }

    }
}
