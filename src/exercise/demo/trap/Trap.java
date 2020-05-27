package exercise.demo.trap;

public class Trap {
    public int trap(int[] height) {
    	int[] right = new int[height.length];
    	int[] left = new int[height.length];
    	int max = 0;
    	for(int i = 0; i < height.length; i++) {
    		left[i] = max;
    		if(height[i] > max) {
    			max = height[i];
    		}

    	}
    	max = 0;
    	for(int i = height.length - 1; i >= 0; i--) {
    		right[i] = max;
    		if(height[i] > max) {
    			max = height[i];
    		}
    	}
    	int sum = 0;
    	for(int i = 0; i < height.length; i++) {
            int minValue = right[i] > left[i] ? left[i] : right[i];
            sum +=(minValue - height[i]) < 0 ? 0 : (minValue - height[i]);
    	}
		return sum;
        
    }
}
