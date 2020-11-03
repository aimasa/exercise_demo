package exercise.demo.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static int likeNum(int[] numArray, int num) {
        int result = numArray[0];
        int left = 0;
        int right = numArray.length - 1;
        while (left < right) {
            int mid = (left + right + 1) / 2;
            if (numArray[mid] < num) {
                left = mid;
            } else if (numArray[mid] > num) {
                right = mid - 1;
            } else {
                return numArray[mid];
            }
        }
        int sub = Math.abs(numArray[left] - num);
        if (left + 1 < numArray.length && sub > Math.abs(numArray[left + 1] - num)) {
            return numArray[left + 1];
        }
        return numArray[left];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strInfo = br.readLine().split(" ");
        int n = Integer.valueOf(strInfo[0]);
        int q = Integer.valueOf(strInfo[1]);
        int[] numArray = new int[n];
        String[] strNum = br.readLine().split(" ");
        for (int i = 0; i < strNum.length && i < n; i++) {
            numArray[i] = Integer.valueOf(strNum[i]);
        }
        Arrays.sort(numArray);
        for (int i = 0; i < q; i++) {
            int num = Integer.valueOf(br.readLine());
            System.out.println(likeNum(numArray, num));
        }
    }
}