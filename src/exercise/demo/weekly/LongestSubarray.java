package exercise.demo.weekly;

import java.util.HashMap;

public class LongestSubarray {
    public int longestSubarray(int[] nums, int limit) {
    int left = 0;
    int min = nums[0];
    HashMap<Integer, Integer> map = new HashMap<>();
    map.put(min, 0);
    int maxLength = 1;
    int max = min;

    for(int i = 1; i < nums.length; i++){
        min = Math.min(nums[i], min);
        max = Math.max(nums[i], max);
        map.put(nums[i], i);
        if(Math.abs(max - min) > limit){
            left = Math.min(map.get(min), map.get(max)) + 1;
            int temp = left;

            System.out.println("temp:" + left);
            int tempMax = nums[left];
            int tempMin = nums[left];
            while(temp < i){
                if(Math.abs(nums[temp] - nums[i]) > limit){
                    left = temp + 1;
                    tempMax = nums[left];
                    tempMin = nums[left];
                }
                temp++;
                tempMax = Math.max(nums[temp], tempMax);
                tempMin = Math.min(nums[temp], tempMin);
            }
            System.out.println("left:" + left);
            if(nums[left] > nums[i]){
                max = tempMax;
                min = nums[i];
            }else{
                min = tempMin;
                max = nums[i];
            }

        }String s = "";
        s.toCharArray();

        maxLength = Math.max(maxLength, i - left + 1);
    }
    return maxLength;


}

    public static void main(String[] args) {
        int[] nums = new int[]{34,24,70,27,40,26,32,47,11,36,12,97,58,12,84,74,83,44,30,50,40,6,42,24,41,75,39,32,43,13,70,79,75,77,12,32,29,3,32,52,10,35,71,10,94,10,3,82,2,38,97,46,64,61,20,13,65,100,42,10,66,86,23,23,100,20,19,41,40,14,91,66,78,38,17,27,19,70,93,5,100,41,80,87,71,96,89,27,23,39,56,69};
        int limit = 72;
        new LongestSubarray().longestSubarray(nums, limit);
    }
}
