package com.yedam.jsc;

public class UnivFriend extends  Friend{
	
	String major;
	UnivFriend(){
		super();
	}
	
	UnivFriend(String name, String phone, String major){
		super(name,phone);
		this.major = major;
	}
	
	void showInfo() {
		System.out.println("이름은"+name+", 연락처는"+phone);
	}
	
	

}
