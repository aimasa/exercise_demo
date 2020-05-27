package exercise.demo.zbishi;

import exercise.demo.zijietiaodong.万万没想到之抓捕孔连顺;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo {
    public static void main(String[] args)  throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] numAndGap = br.readLine().split(" ");
        int num = Integer.valueOf(numAndGap[0]);
        int gap = Integer.valueOf(numAndGap[1]);
        String[] strInt = br.readLine().split(" ");
        int[] site = new int[strInt.length];
        for(int i = 0; i < strInt.length; i++){
            site[i] = Integer.valueOf(strInt[i]);
        }
        int result = new 万万没想到之抓捕孔连顺().touch(num, gap, site);
        System.out.println(result);
    }
}
