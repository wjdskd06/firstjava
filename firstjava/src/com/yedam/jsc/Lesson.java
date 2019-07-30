package com.yedam.jsc;

public class Lesson {
	
	String className;
	Student[] students;
	
	public Lesson() {
		// TODO Auto-generated constructor stub
	}
	public Lesson(String classname,Student[] stu) {
		
	}
	
	
	double javaAvg() {
		int sum = 0;
		int cnt = 0;
		for(int i=0; i<students.length; i++) {
			if(students[i] != null)
			sum += students[i].javaScore;
		}
		return sum/students.length;
	}
	
	double dbAvg() {
		int sum = 0;
		int cnt = 0;
		for(int i=0; i<students.length; i++) {
			if(students[i] != null)
			sum += students[i].dbScore;
		}
		return sum/students.length;
	}
	

}
