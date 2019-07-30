package Yedam;

public class MySenodProgram {
	
		public static void main(String[] args) {	
			
			int a, b, c, d;
			a = 3;
			b = 5;
			c = 7;
			d = 9;
			
			
			sum(20);
			
	
/*			if(a>b)
				System.out.println(a - b);
			else
				System.out.println(b - a);
			if(a>c)
				System.out.println(a - c);
			else
				System.out.println(c - a);
*/			
		}
		
		
		static void sum(int x) {
			
			int sum;
			sum = 0;
			int a =1;
			while (a <= x) {
				sum = sum + a;
				a++;
			}
			System.out.println("Result : " +sum);
			
		}

		
		
		static void diff(int x, int y) {
			
			if(x>y)
				System.out.println(x - y);
			else
				System.out.println(y - x);
			
			
			
		}
}


