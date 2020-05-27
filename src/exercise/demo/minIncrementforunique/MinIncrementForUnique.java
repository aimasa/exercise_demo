package exercise.demo.minIncrementforunique;

public class MinIncrementForUnique {
    public int minIncrementForUnique(int[] A) {
    	int[] result = new int[50000];
    	int count = 0;
    	for(int i = 0; i < A.length; i++) {
    		if(result[A[i]] == 0) {
    			result[A[i]] += 1;
    			continue;
    		}
    		while (result[A[i]] == 1 ) {
				A[i] += 1;
				count++;
			}
    		result[A[i]] += 1;
    	}
		return count;
    }
}
