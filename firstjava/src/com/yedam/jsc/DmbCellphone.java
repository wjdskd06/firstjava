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
		System.out.println("ä��"+ channel + "��ۼ���");
	}
	
	void powerOn(int num) {
		System.out.println("DMB ���� �Ҵ�");
	}
	void turnOffDmb(){
		System.out.println("DMB ��� ���� ����");
	}
	
	void changerChannel(int channel) {
		System.out.println("ä��"+channel+"����");
		
	}
	

}
