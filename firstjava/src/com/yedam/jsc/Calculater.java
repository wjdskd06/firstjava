package com.yedam.jsc;

public class Calculater {
	
	
	static int multi(int x, int y) {
		return x*y;
	}
	
	static double div(double x, double y) {
		return x/y;
	}
	
	
	
	
	
	
		int plus(int x, int y) {
			int result = x + y;
			return result;
	}
		
		double avg(int x, int y) {
			int sum = plus(x,y);
			double result = sum /2;
			return result;
		}
		
		void execute() {
			double result = avg(7,10);
			System.out.println("결과값은 : "+result);
			
		}
		
		void println(String message) {
			System.out.println(message);
		}
		
		void areaRectagle(double x, double y) {
			double i;
			i = x * y;
			System.out.println("Result : " + i);
		}
		
		void areaRectagle(double a) {
			double i;
			i =a * a;
			System.out.println("Result : " + i);
			
		}
		
		
}
