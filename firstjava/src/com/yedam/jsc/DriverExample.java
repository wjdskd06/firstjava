package com.yedam.jsc;

class Vechicle{
	void run() {
		System.out.println("자동차가 달립니다.");
	}
}

class Bus extends Vechicle{

	@Override
	void run() {
		System.out.println("버스가 달립니다.");
	}
class Taxi extends Vechicle{

	@Override
	void run() {
		System.out.println("택시가 달립니다.");
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
