package com.yedam.jsc;

public class LessonExample {
	
	public static void main(String[] args) {
		Student[] javaStudents = new Student[10];
		javaStudents[0] = new Student("������",10,11);
		javaStudents[1] = new Student("�̼���",10,11);
		javaStudents[2] = new Student("ȫ�浿",10,11);
		javaStudents[3] = new Student("������",10,11);
		
		
		Lesson javaClass = new Lesson("�ڹٹ�", javaStudents);
		System.out.println(
				javaClass.className + "�� �ڹ������"
			+	javaClass.javaAvg() + "��� �����"
			+	javaClass.dbAvg() + "�Դϴ�.");
		System.out.println();
		
		
		
		
	}
	
	
	
	
	

}
