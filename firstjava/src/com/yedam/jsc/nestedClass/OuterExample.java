package com.yedam.jsc.nestedClass;

public class OuterExample {
	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.method();
		//inner class
		Outer.B b=outer.new B();
		b.fieldB=10;
		b.methodB();
		//instance class
		Outer.C c=new Outer.C();
		c.fieldC=10;
		c.methodC();
		
		//static class
		Outer.C.fieldCC=10;//static field
		Outer.C.methodCC();//static method
	}
	
	

}

