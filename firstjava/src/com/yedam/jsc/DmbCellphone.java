package com.yedam.jsc;

public class DmbCellphone extends Cellphone{
	
	int channel;
	public DmbCellphone() {
		super();
		this.channel = channel;
	}
	
	public DmbCellphone(String model, String color, int channel)
	{
		super(model, color);
		this.channel = channel;
	}
	
	void turnOnDmb() {
		System.out.println("채널"+ channel + "방송수신");
	}
	
	void powerOn(int num) {
		System.out.println("DMB 전원 켠다");
	}
	void turnOffDmb(){
		System.out.println("DMB 방송 수신 멈춤");
	}
	
	void changerChannel(int channel) {
		System.out.println("채널"+channel+"변경");
		
	}
	

}
