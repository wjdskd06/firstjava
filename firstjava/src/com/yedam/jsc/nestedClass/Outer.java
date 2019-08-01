package com.yedam.jsc.nestedClass;

public class Outer {
	class B{
		B(){
			System.out.println("B객체가 생성됨.");
		}
		int fieldB;
		void methodB() {
		System.out.println("B메소드 호출.");
			
		}
	}
	static class C{
		C(){
			System.out.println("C객체가 생성됨.");
		}
		int fieldC;
		static int fieldCC;
		void methodC() {
			System.out.println("C메소드 호출.");
		}
		static void methodCC() {
			System.out.println("CC메소드 호출.");
		}
	}
	
	interface D{
		int fieldD =4;
		void method();
		
	}
	void method() {
		
		class F{
			F(){
				System.out.println("F객체 생성");
			}
			int fieldF;
			void methodF() {
				System.out.println("F메소드 호출.");
			}
		}
		F f=new F();
		f.fieldF=10;
		f.methodF();
	}

}
