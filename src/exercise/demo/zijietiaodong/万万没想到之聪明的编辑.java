package exercise.demo.zijietiaodong;

import java.io.*;

class 万万没想到之聪明的编辑 {
    public String checkStr(String str){
        int count = 1;
        char[] charStr = str.toCharArray();
        if(charStr.length == 0){
            return "";
        }
        int temp = 0;
        StringBuffer sb = new StringBuffer();
        sb.append(charStr[0]);
        for(int i = 1; i < charStr.length; i++){
            if(charStr[i] == charStr[i - 1]){
                count += 1;
            }
            else{
                temp = count;
                count = 1;
            }
            //aacc   aac
            if(temp == 2 && count == 2){
                count = 1;
                continue;
            }
            if(count >= 3){
                count -= 1;
                continue;
            }
            sb.append(charStr[i]);
        }
        return sb.toString();
    }

    public static void main(String[] args)  throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = null;
        int n = Integer.valueOf(br.readLine());
        for(int i = 0; i < n; i++){
            str = br.readLine();
            String result = new 万万没想到之聪明的编辑().checkStr(str);
            System.out.println(result);
        }


    }
}
