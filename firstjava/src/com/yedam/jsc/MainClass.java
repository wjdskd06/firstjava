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

		fAry[0] = new Friend("������", "1111");

		fAry[1] = new UnivFriend("������", "2222", "����");
		fAry[2] = new CompFriend("������", "3333", "�ѹ���");

		for (Friend f : fAry) {
			if (f != null)
				f.showInfo();
		}
		// Scanner, while(true){} , �޴� : 1)��� 2)��ȸ 3)����
		// ģ�� ����ó -> �̸�, ��ȭ��ȣ
		// ȸ�� ���� -> �̸�, ��ȭ��ȣ, �μ�
		// 1) ���е��� : �̸�, ��ȭ��ȣ, ���� -> ����
		// 2) ȸ�絿�� : �̸�, ��ȭ��ȣ, �μ� -> ����
		// 3) ģ�� : �̸�, ��ȭ��ȣ -> ����
		while (true) {

			System.out.println("�޴��� ���� �ϼ��� 1)��� 2)��ȸ 3)����");
			menu = sc.nextInt();
			sc.nextLine();

			if (menu == 1) {
				System.out.println("�޴��� �����ϼ��� 1)ģ�� 2)���е��� 3)���嵿��");
				menu1 = sc.nextInt();
				sc.nextLine();
				if (menu1 == 1) {
					System.out.println("�̸�");
					String fname = sc.nextLine();
					System.out.println("����ó");
					String fnum = sc.nextLine();
					sc.nextLine();
					for (i = 0; i < fAry.length; i++) {
						if (fAry[i] == null) {
							fAry[i] = new Friend(fname, fnum);
							break;
						}
					}
				} else if (menu1 == 2) {
					System.out.println("�̸�");
					String uname = sc.nextLine();
					System.out.println("����ó");
					String unum = sc.nextLine();
					System.out.println("����");
					String major = sc.nextLine();
					for (i = 0; i < fAry.length; i++) {
						if (fAry[i] == null) {
							fAry[i] = new UnivFriend(uname, unum,major);
							break;
						}
					}
					
				} else if (menu1 == 3) {
					System.out.println("�̸�");
					String cname = sc.nextLine();
					System.out.println("����ó");
					String cnum = sc.nextLine();
					System.out.println("�μ�");
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
				System.out.println("�̸��� �Է� �ϼ���.");
				String cname = sc.nextLine();
				for(i=0; i<fAry.length; i++) {
					if(menu==1)
					{
					}
				}
				
				
			}
			
				else {
				System.out.println("�����մϴ�.");
				break;
			
				
				

		}
			System.out.println("�˻��� �̸� �Է�");
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
