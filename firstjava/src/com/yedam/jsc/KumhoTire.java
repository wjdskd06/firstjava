package com.yedam.jsc;

public class KumhoTire extends Tire{

	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean roll() {
			accmulatedRotation++;
			if(accmulatedRotation < maxRotation) {
				System.out.println(location + "Kumho Tire ¼ö¸í" + (maxRotation-accmulatedRotation)+"È¸");
				return true;
				}
			else {
				System.out.println("***" + location + "Kumho Tire ÆãÅ© ***");
				return false;
	}
	
	
}
}
	

	