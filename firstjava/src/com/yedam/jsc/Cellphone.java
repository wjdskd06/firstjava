package com.yedam.jsc;

public class Cellphone {
	
	String model;
	String color;
	public Cellphone() {
		
	}
	
	public Cellphone(String model, String color) {
		this.model = model;
		this.color = color;
	}
	
	void powerOn() {
		System.out.println("���� �Ҵ�.");
	}
	void powerOff() {
		System.out.println("���� ����");
	}
	
	void bell()
	{
		System.out.println("�� �︰��");
	}
	
	

}
