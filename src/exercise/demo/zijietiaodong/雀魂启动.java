package exercise.demo.zijietiaodong;

import exercise.demo.weeklycom.Solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 雀魂启动 {
    public String start(int[] pai) {
        int[] nums = new int[10];
        for (int i = 0; i < pai.length; i++) {
            nums[pai[i]] += 1;
        }
        StringBuffer sb = new StringBuffer();
        int[] copyNums = new int[10];
        for (int i = 1; i <= 9; i++) {

            if (nums[i] < 4) {
                System.arraycopy(nums, 0, copyNums, 0, 10);
                copyNums[i] += 1;
                if (ishepai(copyNums, 0, true)) {
                    sb.append(i);
                    sb.append(" ");
                }

            }
        }
        return sb.toString().trim();


    }

    public boolean ishepai(int[] nums,int left, boolean isHead) {
        if (isHead) {
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] < 2) {
                    continue;
                }
                nums[i] -= 2;
                if(ishepai(nums, 0,false)){return true;};
                nums[i] += 2;
            }
        } else {
            int sum = 0;
            for(int i = left; i < nums.length; i++){
                if(nums[i] != 0){
                    sum += nums[i];
                }
            }
            if(sum == 0){
                return true;
            }
            if(sum < 3){
                return false;
            }

            while(left < nums.length && nums[left] == 0){
                left++;
            }
                if(left + 2 < nums.length && nums[left + 1] != 0 && nums[left + 2] != 0){
                    nums[left] -= 1;
                    nums[left + 1] -= 1;
                    nums[left + 2] -= 1;
                    if(ishepai(nums, left, false)){return true;}
                    nums[left] += 1;
                    nums[left + 1] += 1;
                    nums[left + 2] += 1;
                }
                if(nums[left] >= 3){
                    nums[left] -= 3;
                    if(ishepai(nums, left, false)){return true;}
                    nums[left] += 3;
                }
            }
        return false;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = null;
        str = br.readLine();
        String[] strNums = str.split(" ");
        int[] nums = new int[strNums.length];
        for (int i = 0; i < strNums.length; i++) {
            nums[i] = Integer.valueOf(strNums[i]);
        }
        System.out.println(new 雀魂启动().start(nums));


    }
}


/*
*  1 1 1 2 3 4 5 5 5 6 6 6 -> 1 2 3 | 1 1 4 5 5 5 6 6 6 -> x
*                          -> 1 1 1 | 2 3 4 5 5 5 6 6 6 -> 2 3 4 | 5 5 5 6 6 6 -> 5 6 7
*
*
*  1 1 1 2 2 2 5 5 5 6 6 6 9 9
*  1 1 1 | 2 2 2 5 5 5 6 6 6 9 9
*
*
*
* */