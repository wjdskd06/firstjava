package Yedam;

public class Myprogram {
	public static void main(String[] args) {
		
		 
		int a = 15;

		if (a >= 30) {
				System.out.println("30 보다 크다");
			} else if (a >= 20) {
				System.out.println("20보다 크다");
			} else if (a >= 10) {
				System.out.println("10보다 크다");
			} else {
				System.out.println("아니다");
			}


			for (int i = 0; i < 10; i++) {
				System.out.println(2 + "*" + (i) + "=" + (2 * (i)));
			}
			star(5);
			a(9);
			
		}

	static void multi(int x) {
		for (int i = 1; i<=9; i++) 

		System.out.println(x + "*" + (i) + "=" + (x * (i)));
	}

	
	static void star(int x) {
		for(int i=1; i<=x; i++) {
			System.out.println();
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
		}}
		
	static void a(int x){
		
		int i = 1;
		while(i < 10) {
			int j = 2;
			while(j < 10 ) {
				if(j%2 == 0 && j==i) {
				System.out.print(j + "*" + i + "=" + (i * j)+ " ");}
				j++;
			}
			System.out.println("\t");
			i++;
	}
		
	 {
		
	}
	}
	}
		
