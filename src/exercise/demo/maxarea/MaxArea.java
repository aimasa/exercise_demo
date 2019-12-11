package exercise.demo.maxarea;

public class MaxArea {
	public int maxArea(int[] height) {
		int i = 0;
		int j = height.length - 1;
		int max = 0;
		while (i != j) {
			int tempArea = (j - i) * Math.min(height[i], height[j]);
			max = tempArea < max ? max : tempArea;
			if (height[i] <= height[j]) {
				i++;
			} else {
				j--;
			}
		}
		return max;
	}
}
