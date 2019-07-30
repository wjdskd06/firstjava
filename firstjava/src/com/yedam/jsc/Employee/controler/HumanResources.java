package com.yedam.jsc.Employee.controler;

import java.util.Scanner;

import com.yedam.jsc.Employee.impl.EmpserviceImpl2;
import com.yedam.jsc.Employee.model.Department;
import com.yedam.jsc.Employee.model.Employee;
import com.yedam.jsc.Employee.model.Empservice;


public class HumanResources {
	
	Scanner sc = new Scanner(System.in);
	Employee[] employees = new Employee[10];
	Empservice service = new EmpserviceImpl2();
	Department[] department = {
		new Department(10,"Adminstration"),
		new Department(20,"Marketing"),
		new Department(30,"Purchasing"),
		new Department(40,"Adminstration")
	};
	
	
	
	public void execute() {
		int menu=0;
		while(true) {
			printMenu();
			menu=sc.nextInt();sc.nextLine();
			if(menu==1) {
				register();
				
			}
			else if(menu==2) {
				search();
			}
			else if(menu==3) {
				list();
			}
			else if(menu==4) {
				delete();
			}
			else if(menu==5) {
				
			}
			else if(menu==6) {
				deptUp();
			}
			else {
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			}
			
		}
	}
	
	private void deptUp() {
		System.out.println("사번을 입력 하세요.");
		int employeeId=sc.nextInt();sc.nextLine();
		Empservice.showDeptList(department);
//		service.empList(employees);
	}

	public void printMenu() {
		System.out.println("메뉴를 선택 하세요 1)등록2)조회3)리스트4)삭제5)업데이트6)부서 갱신7)종료");
	}
	
	public void register() {
		System.out.println("사번을 입력 하세요.");
		int employeeId=sc.nextInt();sc.nextLine();
		System.out.println("이름을 입력 하세요.");
		String firstName=sc.nextLine();
		System.out.println("성을 입력 하세요.");
		String lastName=sc.nextLine();
		System.out.println("급여를 입력 하세요.");
		int salary=sc.nextInt();sc.nextLine();
		System.out.println("부서를 입력 하세요.");
		int department=sc.nextInt();sc.nextLine();
		Employee emp=new Employee(employeeId, firstName, lastName, salary,department);
		service.regiserEmp(emp, employees);
	}
	
	public void search() {
		System.out.println("조회할 사번을 입력 하세요.");
		int empId=sc.nextInt();sc.nextLine();
		service.searchEmp(empId, employees);
		
	}
	
	public void list() {
		System.out.println("사원 리스트 입니다.");
		service.empList(employees);
	}
	
	public void delete() {
		System.out.println("삭제할 사번을 입력하세요.");
		int empId=sc.nextInt();sc.nextLine();
		service.deleteEmp(empId, employees);
	}
	
	public void update() {
		System.out.println("변경할 사원의 사번을 입력하세요.");
		int empId=sc.nextInt();sc.nextLine();
		System.out.println("변경할 사원의 급여를 입력하세요.");
		int sal=sc.nextInt();sc.nextLine();
		Employee emp = service.returnEmp(empId, employees);
		emp .setSalary(sal);
		//service.
		
		
		
	}

}
