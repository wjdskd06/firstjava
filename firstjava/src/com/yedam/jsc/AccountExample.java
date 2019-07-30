package com.yedam.jsc;

import java.util.Scanner;

public class AccountExample {
	Account[] acntAry = new Account[5];
	Scanner sc = new Scanner(System.in);

	public void execute() {
		int menu = 0;
		// �޴�..1)�ű԰��»��� 2)�Ա� 3)��� 4)����

		
				Account acnt3 = null;
				while (true) {
					System.out.println("�޴��� �����ϼ���. 1)�ű�2)�Ա�3)���4)�ܾ�5)����");
					
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
						System.out.println("����");
						break;
					}

				}
				System.out.println("���α׷��� ����  �Ǿ����ϴ�.");
			}

		void createAccount() {

				System.out.println("�ű�");
				System.out.println("���¹�ȣ�� �Է� �ϼ���.");
				String accNo = sc.nextLine();
				System.out.println("�̸��� �Է� �ϼ���");
				String name = sc.nextLine();
				System.out.println("�ݾ��� �Է� �ϼ���");
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
		System.out.println("�Ա�");
		System.out.println("���� ��ȣ �Է� : ");
		String accNo = sc.nextLine();
		System.out.println("�Ա� �ݾ��� �Է� �ϼ���.");
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
		System.out.println("���");
		System.out.println("���� ��ȣ �Է� : ");
		String accNo = sc.nextLine();
		System.out.println("����� �ݾ��� �Է� �ϼ���.");
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
		System.out.println("�ܾ�");
		System.out.println("���� ��ȣ �Է� : ");
		String accNo = sc.nextLine();
		for (int i = 0; i < acntAry.length; i++) {
			if (acntAry[i] != null && acntAry[i].getAccountNO().equals(accNo)) {
				acntAry[i].checkbalance();
				break;
//		acnt3.checkbalance();
			} else
				System.out.println("���� ���� �Դϴ�.");
			break;
		}

	}

	void allAccount() {
		System.out.println("��ȸ");
		for (int i = 0; i < acntAry.length; i++) {
			if (acntAry[i] != null) {
				acntAry[i].checkbalance();

			}
		}
	}

	
}
