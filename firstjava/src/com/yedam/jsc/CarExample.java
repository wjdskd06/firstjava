package com.yedam.jsc;

public class CarExample {
	
	public static void main(String[] args) {
		Car car = new Car();
		
		for(int i=0; i<6; i++) {
		int errorLocation = car.run();
		switch(errorLocation) {
		case 1:
			System.out.println("�տ��� => hankookTire ��ü");
			car.frontLeft = new HankookTire("�տ���",15);
			break;
			
		
			
		case 2:
			System.out.println("�տ����� => KumhoTire ��ü");
			car.frontRight = new HankookTire("�տ�����",14);
			break;
			
		case 3:
			System.out.println("�ڿ��� => HankookTire ��ü");
			car.backLeft = new HankookTire("�ڿ���",16);
			break;
			
		case 4:
			System.out.println("�ڿ����� => KumhoTire ��ü");
			car.backRight = new HankookTire("�ڿ�����",13);
			break;
			
			
		
		}
		
		
	}

}
}