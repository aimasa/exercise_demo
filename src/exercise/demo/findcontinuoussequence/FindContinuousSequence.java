package exercise.demo.findcontinuoussequence;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.function.IntFunction;

import exercise.demo.convert.Convert;

public class FindContinuousSequence {
	public int[][] findContinuousSequence(int target) {
		List<int[]> result = new ArrayList<int[]>();
		for (int i = 1; target - (i + 1) * i * 0.5 > 0; i++) {
			if ((i + 1) * i % 0.5 != 0) {
				continue;
			}
			double temp = (target - (i + 1) * i * 0.5) % (i + 1);
			if (temp != 0) {
				continue;
			}
			int resultX = (int) (target - (i + 1) * i * 0.5) / (i + 1);
			int tempIndexI = 0;
			int[] tempResult = new int[i + 1];
			while (tempIndexI <= i) {
				tempResult[tempIndexI] = resultX + tempIndexI;
				tempIndexI++;
			}
			Collections.reverse(result);
			result.add(tempResult);
		}

		return result.toArray(new int[result.size()][]);

	}
}
