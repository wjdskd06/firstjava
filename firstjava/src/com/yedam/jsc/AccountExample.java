package com.yedam.jsc;

import java.util.Scanner;

public class AccountExample {
	Account[] acntAry = new Account[5];
	Scanner sc = new Scanner(System.in);

	public void execute() {
		int menu = 0;
		// 메뉴..1)신규계좌생성 2)입금 3)출금 4)종료

		
				Account acnt3 = null;
				while (true) {
					System.out.println("메뉴를 선택하세요. 1)신규2)입금3)출금4)잔액5)종료");
					
					menu = sc.nextInt();
					sc.nextLine();
					if (menu == 1) {
						createAccount();
						
							}
						
					else if (menu == 2) {
						depositAccount();
						
							}
						
						
					 else if (menu == 3) {
						 withdrawAccount();
						
							}
						
					 else if (menu == 4) {
						 checkBalance();
						
						}

					else if (menu == 5) {
						allAccount();
						
							}
						

					

					else {
						System.out.println("종료");
						break;
					}

				}
				System.out.println("프로그램이 종료  되엇습니다.");
			}

		void createAccount() {

				System.out.println("신규");
				System.out.println("계좌번호를 입력 하세요.");
				String accNo = sc.nextLine();
				System.out.println("이름을 입력 하세요");
				String name = sc.nextLine();
				System.out.println("금액을 입력 하세요");
				int balance = sc.nextInt();
				sc.nextLine();
				for (int i = 0; i < acntAry.length; i++) {
					if (acntAry[i] == null) {
						acntAry[i] = new Account(accNo, name, balance);
						break;
					}
				}

	}
	void depositAccount() {
		System.out.println("입금");
		System.out.println("계좌 번호 입력 : ");
		String accNo = sc.nextLine();
		System.out.println("입금 금액을 입력 하세요.");
		int money = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < acntAry.length; i++) {
			if (acntAry[i] != null && acntAry[i].getAccountNO().equals(accNo)) {
				acntAry[i].deposit(money);
				break;
			}

		}
	}

	void withdrawAccount() {
		System.out.println("출금");
		System.out.println("계좌 번호 입력 : ");
		String accNo = sc.nextLine();
		System.out.println("출금할 금액을 입력 하세요.");
		int money = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < acntAry.length; i++) {
			if (acntAry[i] != null && acntAry[i].getAccountNO().equals(accNo)) {
				acntAry[i].withdraw(money);
				break;

			}
		}
	}

	void checkBalance() {
		System.out.println("잔액");
		System.out.println("계좌 번호 입력 : ");
		String accNo = sc.nextLine();
		for (int i = 0; i < acntAry.length; i++) {
			if (acntAry[i] != null && acntAry[i].getAccountNO().equals(accNo)) {
				acntAry[i].checkbalance();
				break;
//		acnt3.checkbalance();
			} else
				System.out.println("없는 계좌 입니다.");
			break;
		}

	}

	void allAccount() {
		System.out.println("조회");
		for (int i = 0; i < acntAry.length; i++) {
			if (acntAry[i] != null) {
				acntAry[i].checkbalance();

			}
		}
	}

	
}
