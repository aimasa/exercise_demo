package exercise.demo.intersection;

public class intersection {
	public double[] intersection(int[] start1, int[] end1, int[] start2, int[] end2) {

		double[] param1 = AB(start1, end1);
		double[] param2 = AB(start2, end2);
		double x = 0;
		double y = 0;
		if (param1 == null && param2 == null) {
			return null;
		}
		if (param1 == null) {
			x = start1[0];
			y = param2[0] * x + param2[1];
		} else if (param2 == null) {
			x = start2[0];
			y = param1[0] * x + param1[1];
		} else if (param1 != null && param2 != null) {
			if (param1[0] - param2[0] == 0) {
				if (param1[1] == 0 && param2[1] == 0) {
					x = Math.max(Math.min(start1[0], end1[0]), Math.min(start2[0], end2[0])) ;
					y = param1[0] * x;
				} else {
					return null;
				}
			} else {
				x = (-1) * Math.round((param1[1] - param2[1]) / (param1[0] - param2[0])) / 1000000;
				y = param1[0] * x + param1[1];
			}
		}
		int maxX = Math.min(Math.max(start1[0], end1[0]), Math.max(start2[0], end2[0]));
		int minX  = Math.max(Math.min(start1[0], end1[0]), Math.min(start2[0], end2[0]));
		int minY = Math.max(Math.min(start1[1], end1[1]), Math.min(start2[1], end2[1]));
		int maxY = Math.min(Math.max(start1[1], end1[1]), Math.max(start2[1], end2[1]));
		
		if (x > maxX || x < minX || y > maxY || y < minY) {
			return null;
		}
		return new double[] { x, y };
	}

	public double[] AB(int[] start, int[] end) {
		if (start[0] == end[0]) {
			return null;
		}
		double a = Math.round((start[1] - end[1]) / (start[0] - end[0]));
		double b = start[1] - a * start[0];
		return new double[] { a, b };

	}
}
