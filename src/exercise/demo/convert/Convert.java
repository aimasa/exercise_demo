package exercise.demo.convert;

public class Convert {
	public void convert(String str, int n) {
		int raw = 0;
		int aboutRaw = str.length() / (2 * n - 2);
		int aboutHight = str.length() % (2 * n - 2);
		if (aboutHight != 0) {
			raw = raw + (aboutHight >= n? aboutHight - n + 1 : 1);
		}
		raw = raw + aboutRaw * (n - 1);
		String resultSpace = "";
//		for (int i = 0; i < n - 2; i++) {
//			resultSpace = resultSpace + " ";
//		}
		for (int i = 0; i < n; i++) {
			String resultRaw = "";
			resultRaw = resultRaw + Character.toString(str.charAt(i));
			int t = i;
			int z;
			if (n - 2 - i < 0 || n - 2 - i == n - 2) {
				while (resultRaw.length() < raw) {
					t = 2 * n - 2 + t;
					resultRaw = resultRaw + resultSpace;
					resultRaw = resultRaw + ((t >= str.length()) ? "" : Character.toString(str.charAt(t)));
				}
//				System.out.println(resultRaw.substring(0, raw - 1));
			} else {
				while (resultRaw.length() < raw) {
					t = 2 * n - 2 + t;
					z = t - 2 * i;
					resultRaw = resultRaw + resultSpace.substring(0, n - 2 - i)
							+ ((z >= str.length()) ? "" : Character.toString(str.charAt(z)));

					resultRaw = resultRaw + resultSpace.substring(n - 2 - i, resultSpace.length() - 1);
					resultRaw = resultRaw + ((t >= str.length()) ? "" : Character.toString(str.charAt(t)));
				}
			}
			System.out.println(resultRaw.substring(0, raw));

		}
	}
}
