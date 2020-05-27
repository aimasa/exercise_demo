package exercise.demo.rotate;

public class Rotate {
	public void rotate(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			int left = 0;
			int right = matrix[i].length - 1;
			while (left < right) {
				int temp = matrix[i][left];
				matrix[i][left] = matrix[i][right];
				matrix[i][right] = temp;
				left++;
				right--;
			}
		}
		int rightx = matrix.length - 1;
		int righty = matrix[0].length - 1;
		int right = matrix[0].length;
		for (int i = 0; i < matrix.length; i++) {
			right--;
			for (int j = 0; j < right; j++) {

				int temp = matrix[i][j];
				matrix[i][j] = matrix[rightx - j][righty - i];
				matrix[rightx - j][righty - i] = temp;
			}
		}
	}
}
