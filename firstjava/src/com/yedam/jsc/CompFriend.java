package com.yedam.jsc;

public class CompFriend extends Friend {
		String department;
		String major;
		CompFriend(){
			super();
		}
		
		CompFriend(String name, String phone, String major){
			super(name,phone);
			this.major = major;
		}
		
		void showInfo() {
			System.out.println("이름은"+name+", 연락처는"+phone+",부서넌 "+department);
		}

}
