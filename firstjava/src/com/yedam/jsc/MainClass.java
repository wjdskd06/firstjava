package com.yedam.jsc;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		
	}
		
		
	
	private void Freindtest() {

		Friend[] fAry = new Friend[10];
		int menu = 0;
		int menu1 = 0;
		int i = 0;
		Scanner sc = new Scanner(System.in);
		String checkname;
//		AccountExample ae = new AccountExample();
//		ae.execute();

		fAry[0] = new Friend("정승찬", "1111");

		fAry[1] = new UnivFriend("정승찬", "2222", "영어");
		fAry[2] = new CompFriend("정승찬", "3333", "총무부");

		for (Friend f : fAry) {
			if (f != null)
				f.showInfo();
		}
		// Scanner, while(true){} , 메뉴 : 1)등록 2)조회 3)종료
		// 친구 연락처 -> 이름, 전화번호
		// 회사 동료 -> 이름, 전화번호, 부서
		// 1) 대학동문 : 이름, 전화번호, 전공 -> 저장
		// 2) 회사동료 : 이름, 전화번호, 부서 -> 저장
		// 3) 친구 : 이름, 전화번호 -> 저장
		while (true) {

			System.out.println("메뉴를 선택 하세요 1)등록 2)조회 3)종료");
			menu = sc.nextInt();
			sc.nextLine();

			if (menu == 1) {
				System.out.println("메뉴를 선택하세요 1)친구 2)대학동문 3)직장동료");
				menu1 = sc.nextInt();
				sc.nextLine();
				if (menu1 == 1) {
					System.out.println("이름");
					String fname = sc.nextLine();
					System.out.println("연락처");
					String fnum = sc.nextLine();
					sc.nextLine();
					for (i = 0; i < fAry.length; i++) {
						if (fAry[i] == null) {
							fAry[i] = new Friend(fname, fnum);
							break;
						}
					}
				} else if (menu1 == 2) {
					System.out.println("이름");
					String uname = sc.nextLine();
					System.out.println("연락처");
					String unum = sc.nextLine();
					System.out.println("전공");
					String major = sc.nextLine();
					for (i = 0; i < fAry.length; i++) {
						if (fAry[i] == null) {
							fAry[i] = new UnivFriend(uname, unum,major);
							break;
						}
					}
					
				} else if (menu1 == 3) {
					System.out.println("이름");
					String cname = sc.nextLine();
					System.out.println("연락처");
					String cnum = sc.nextLine();
					System.out.println("부서");
					String dep = sc.nextLine();
					for (i = 0; i < fAry.length; i++) {
						if (fAry[i] == null) {
							fAry[i] = new CompFriend(cname, cnum,dep);
							break;
						}
							
						}
					
					}

				}
			else if(menu==2) {
				System.out.println("이름을 입력 하세요.");
				String cname = sc.nextLine();
				for(i=0; i<fAry.length; i++) {
					if(menu==1)
					{
					}
				}
				
				
			}
			
				else {
				System.out.println("종료합니다.");
				break;
			
				
				

		}
			System.out.println("검색할 이름 입력");
			checkname = sc.nextLine();

			for(i=0; i<3; i++) {
				
				if(fAry[i].name.equals(checkname)){
					System.out.println();
					System.out.println();
					System.out.println();
				}

				
			}
			
			

	}

	}
}
