package com.yedam.jsc;

public class HankookTire extends Tire{

	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean roll() {
		accmulatedRotation++;
		if(accmulatedRotation < maxRotation) {
			System.out.println(location + "Hankook Tire ����" + (maxRotation-accmulatedRotation)+"ȸ");
			return true;
			}
		else {
			System.out.println("***" + location + "Hankook Tire ��ũ ***");
			return false;
		// TODO Auto-generated method stub
	}
	

}
}
