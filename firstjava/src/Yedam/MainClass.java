package Yedam;

import java.util.Scanner;

public class MainClass {
	public static void main(String args[]) {
//		Student  st1 = new Student("�̼���","����",20);
//		Student st1 = new Student();
//		st1.setName("ȫ�浿");
//		st1.setMajor("����");
//		st1.setAge(18);
//		st1.setHeight(181);

//		Student st1 = new Student();
//		st1.setName("name1");
//		Student st2 = new Student();
//		st2.setName("name2");
//		Student st3 = new Student();
//		st3.setName("name3");
		Scanner sc = new Scanner(System.in);

		Student[] stuAry = new Student[3];
//		stuAry[0] = st1;
//		stuAry[1] = st2;
//		stuAry[2] = st3;
		
		String name = "";
		String major = "";
		int age ;
		int a  = 0;
		while(true) {
			System.out.println("�̸��� �Է� �ϼ���.");
			name = sc.nextLine();
			System.out.println("������ �Է� �ϼ���.");
			major = sc.nextLine();
			System.out.println("������ �Է� �ϼ���.");
			age = sc.nextInt();
			sc.nextLine();
			Student s1 = new Student();
			s1.setName(name);
			s1.setMajor(major);
			s1.setAge(age);
			stuAry[a] = s1;
			a++;
			if(a >=3)
				break;
		}
		
		for(Student st : stuAry) {
			System.out.println(st.getName());
		}

//		st1.study();
//		st1.introduce();
//		st1.showheight();

	}

}
