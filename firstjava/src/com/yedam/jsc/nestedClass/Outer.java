package com.yedam.jsc.nestedClass;

public class Outer {
	class B{
		B(){
			System.out.println("B��ü�� ������.");
		}
		int fieldB;
		void methodB() {
		System.out.println("B�޼ҵ� ȣ��.");
			
		}
	}
	static class C{
		C(){
			System.out.println("C��ü�� ������.");
		}
		int fieldC;
		static int fieldCC;
		void methodC() {
			System.out.println("C�޼ҵ� ȣ��.");
		}
		static void methodCC() {
			System.out.println("CC�޼ҵ� ȣ��.");
		}
	}
	
	interface D{
		int fieldD =4;
		void method();
		
	}
	void method() {
		
		class F{
			F(){
				System.out.println("F��ü ����");
			}
			int fieldF;
			void methodF() {
				System.out.println("F�޼ҵ� ȣ��.");
			}
		}
		F f=new F();
		f.fieldF=10;
		f.methodF();
	}

}
