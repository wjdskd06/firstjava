package Test123;

public class cal1 {
	public static void main(String[] args) {
		int[] intAry = { 1, 5, 3, 9, 7, 10};

		int max = 0;

		for (int i = 0; i < intAry.length; i++) {
			if (intAry[i] > max) {
				max = intAry[i];
			}
		}
		System.out.println(max);
	}
}
