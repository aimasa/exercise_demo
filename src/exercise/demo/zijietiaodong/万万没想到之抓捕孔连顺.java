package exercise.demo.zijietiaodong;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 万万没想到之抓捕孔连顺 {
    public int touch(int numBuild, int gap, int[] site){
        int left = 0;
        int right = numBuild - 1;
        int count = 0;
        while (left < right){
            if(site[right] - site[left] > gap ){
                right--;
            }
            else{
                int temp = right - left + 1;
                int tempResult = temp - 3 == 0? 1 : 0;
                if(temp - 3 > 0){
                    tempResult = temp * (temp - 1) * (temp - 2) /6;
                }
                count += tempResult;
                left = right;
                right = numBuild - 1;
            }

        }
        return count;
    }

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
