package com.yedam.jsc.generic;

public class NumberExample {
	public static void main(String[] args) {
		int result = Util.compare(30, 20);
		System.out.println(result);
		compareStr("abc", "abcd");
		
	}
	static String compareStr(String st1, String st2) {
		if(st1.length() > st2.length()) {
			System.out.println(st1);
		}
		else {
			System.out.println(st2);
		}
		return st2;
	}
	
}
