package firstjava;

import java.util.Scanner;

public class test1 {
	public static void main(String[] args) {
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		

		a = sc.nextInt();
		b = sc.nextInt();
		for (int i = 0; i < a; i++) {
			c = sc.nextInt();

			if (c < b)
				System.out.println(c);

		}

	}
}