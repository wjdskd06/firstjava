package com.yedam.jsc;

public class Friend {

		String name;
		String phone;
		Friend(){
			
		}
		
		Friend(String name, String phone){
			this.name = name;
			this.phone = phone;
		}
		
		void showInfo(){
			System.out.println("�̸���"+name+", ����ó��"+phone);
			
		}
}
