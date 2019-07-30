package com.yedam.jsc;

public class LessonExample {
	
	public static void main(String[] args) {
		Student[] javaStudents = new Student[10];
		javaStudents[0] = new Student("정승찬",10,11);
		javaStudents[1] = new Student("이순신",10,11);
		javaStudents[2] = new Student("홍길동",10,11);
		javaStudents[3] = new Student("김유신",10,11);
		
		
		Lesson javaClass = new Lesson("자바반", javaStudents);
		System.out.println(
				javaClass.className + "의 자바평균은"
			+	javaClass.javaAvg() + "디비 평균은"
			+	javaClass.dbAvg() + "입니다.");
		System.out.println();
		
		
		
		
	}
	
	
	
	
	

}
