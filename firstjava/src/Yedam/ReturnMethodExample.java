package Yedam;

public class ReturnMethodExample {
	public static void main(String[] args) {
		
		String[] strAry = {"sun", "mon", "tue", "wed", "thr", "fri", "sat"};
		int month = 7;
		for(String str : strAry) {
			System.out.print(str + " ");
		}
		System.out.println();
		System.out.println("--------------------------------------");
		int firstdate = getday(month);
			for(int i =1; i<firstdate; i++) {
				System.out.println("    ");
				i++;
			}
		
		
		int dateoflast = getlastday(month);
		for(int i=1; i<=dateoflast; i++) {
			System.out.printf("%2d ",i);
			if(i % 7 == 0)
				System.out.println();
		}
		
			
		sum(3, 5);
//		int result = sum2(3,5);
		double result = avg(3,6);
//	    System.out.println("sum2 : " + result);
		System.out.println("avg : "+ result);
		System.out.println("마지막 날 출력 : " + getlastday(3));
		System.out.println("1일은 무슨 요일? : " + getday(7));
	}
	
	
	
	
	static int getday(int month) {
		if(month == 7)
			return 2;
		else if(month == 8)
			return 5;
		else if(month == 9)
			return 1;
		else
			return 0;
	}
	
	
	
	static int getlastday(int month) {
		if(month == 4 || month == 6 || month == 9 || month == 11)
			return 30;
		else if (month == 2)
			return 28;
		else
			return 30;

		
	}
	
	
	static void sum(int x, int y){
		System.out.println("sum : " + (x+y));
		
	}
	
	
	static int sum2(int x, int y) {
		return x + y;
	}
	
	static double avg(int x, int y) {
		return y / x;
	}

}

