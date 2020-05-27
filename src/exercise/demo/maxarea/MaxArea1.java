package exercise.demo.maxarea;

public class MaxArea1 extends MaxArea{
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int max = 0;
        while(left < right){
            int result = (right - left) * Math.min(height[left], height[right]);
            max = max > result? max : result;
            if(height[left] > height[right]){
                right--;
            }
            else if(height[left] <= height[right]){
                left++;
            }
        }
        return max;

    }
}
