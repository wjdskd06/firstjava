package firstjava;

public class First {
	public static void main(String[] args) 
	{
		System.out.println("Hello world");
		System.out.println("  *");
		System.out.println(" ***");
		System.out.println("*****");
		System.out.println("end of program");
		System.out.println(3*5);
		startprogram(3);
		for(int i = 0; i < 5; i++)
		{
//			System.out.println("i의 값은 : " + i);
//			startprogram(i+1);
		}
//		sum(2,3);
		div(3,2);
		mod(3,2);
		introduce("정승찬", 28, 180.3);
		test(3,10);
		
		int sum = 0;
		for(int i=0; i < 10; i++)
		{
			sum = sum + 1;
		}
		
		
		
	}
	static void startprogram(int x)
	{
		int a,b,c;
		a = 1;
		b = 2;
		c = (a + b)*x;
		System.out.println("Result : " + c);
	}


	static void sum(int x, int y)
	{
		System.out.println("Reslut : " + (x + y));
	}
	
	static void div(int a, int b)
	{
		System.out.println("Result : " +(a/b));
	}
	
	static void mod(int x, int y)
	{
		int m = x%y;
		System.out.println("나머지는 : " + m);
	}
	
	static void introduce(String name, int age, double height)
	{
		System.out.println("이름은 : " + name + "나이는 : " + age + "키는 : " + height);
	}
	
	static void test(int x, int y)
	{
		int sum = 0;
		for(int i=1; i<y; i++)
		{
			x = x + i;
			sum = x;
		}
		System.out.println();
	}
	
	
	
	
	
}