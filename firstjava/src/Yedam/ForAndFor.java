package Yedam;

public class ForAndFor {
	public static void main(String[] arg) {
		int a = 1;
		while (a <= 8) {
			a++;
			int b = 0;
			while (b <= 8) {
				b++;
				System.out.println(a + "*" + b + "=" + (a*b));
			}
		}

	}
}
