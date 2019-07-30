package com.yedam.jsc;

import java.util.Calendar;

public class CalendarExample {
	public static void main(String[] args) {
		Calendar now =  Calendar.getInstance();
//		System.out.println(now.get(Calendar.YEAR));
//		System.out.println(now.get(Calendar.MONTH));
//		System.out.println(now.get(Calendar.DAY_OF_MONTH));
//		System.out.println(now.getActualMaximum(Calendar.DAY_OF_MONTH));
//		System.out.println(now.get(Calendar.DAY_OF_WEEK));
		now.set(2019, 0, 1);
		System.out.println(now.get(Calendar.YEAR));
		System.out.println(now.get(Calendar.MONTH));
		System.out.println(now.get(Calendar.DAY_OF_MONTH));
		System.out.println(now.getActualMaximum(Calendar.DAY_OF_MONTH));
		System.out.println(now.get(Calendar.DAY_OF_WEEK));
		
		
	}
	
	static void showCal(int year, int month) {
		
	}
}
