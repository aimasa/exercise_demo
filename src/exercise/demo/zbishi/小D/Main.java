package exercise.demo.zbishi.小D;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class Main {
    public int result(String[] dic, String str){
        return fanyi(dic, str, 0);
    }
    public int fanyi(String[] dic, String str, int right){
       if(right >= str.length()){
           return 1;
       }
       long result = 0;
       for(int i = 0; i < dic.length; i++){
           if(right + dic[i].length() <= str.length() && dic[i].equals(str.substring(right, right + dic[i].length()))){
               result += fanyi(dic, str, right + dic[i].length());
           }
       }
       return (int) (result % 835672545);
    }
    public static void main(String[] args)  throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int n = Integer.valueOf(br.readLine());
        String[] dic = new String[n];
        for(int i = 0; i < n; i++){
            String strInt = br.readLine();
            dic[i] = strInt;
        }
       System.out.println(new Main().result(dic, str));

    }

}
