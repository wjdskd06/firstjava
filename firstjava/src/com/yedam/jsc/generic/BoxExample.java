package com.yedam.jsc.generic;

class Box {
	private Object object;

	public void set(Object object) {
		this.object = object;

	}

	public Object get() {
		return this.object;
	}
}

class Apple {

}

class Orange {

}

public class BoxExample {
	public static void main(String[] args) {
		Box box = new Box();
		box.set("Hello");
		String retStr = (String) box.get();
		box.set(new Integer(10));
		Integer retInt = (Integer) box.get();
		// ¹®Á¦.
		box.set(new Apple());
		Apple retApple = (Apple) box.get();
		box.set("World");
		retApple = (Apple) box.get();

	}
}
