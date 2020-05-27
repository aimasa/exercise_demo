package exercise.demo.distributecandies;

import java.util.ArrayList;
import java.util.List;

import javax.sound.sampled.LineListener;

public class DistributeCandies {
	public int[] distributeCandies(int candies, int num_people) {
		int index = 0;
		int[] num = new int[num_people];
		while (candies > 0) {
			num[index % num_people] += Math.min(index + 1, candies);
			candies -= Math.min(index + 1, candies);

			index++;
		}

		return num;
	}
}
