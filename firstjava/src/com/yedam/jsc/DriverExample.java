package com.yedam.jsc;

class Vechicle{
	void run() {
		System.out.println("�ڵ����� �޸��ϴ�.");
	}
}

class Bus extends Vechicle{

	@Override
	void run() {
		System.out.println("������ �޸��ϴ�.");
	}
class Taxi extends Vechicle{

	@Override
	void run() {
		System.out.println("�ýð� �޸��ϴ�.");
	}
	
}
}
class Driver{
	void drive(Vechicle Vechicle) {
		Vechicle.run();
	}
}


public class DriverExample {
	public static void main(String[] args) {
		
		Driver driver = new Driver();
		Vechicle v = new Vechicle();
//		v = new bus();
//		v = new taxi();
//		driver.drive(v);
//		driver.drive(bus);
//		driver.drive(taxi);
		
		
		
		
		
		
	}
	

}
