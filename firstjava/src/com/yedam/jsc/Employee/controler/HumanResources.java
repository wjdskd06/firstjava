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
				System.out.println("���α׷��� �����մϴ�.");
				System.exit(0);
			}
			
		}
	}
	
	private void deptUp() {
		System.out.println("����� �Է� �ϼ���.");
		int employeeId=sc.nextInt();sc.nextLine();
		Empservice.showDeptList(department);
//		service.empList(employees);
	}

	public void printMenu() {
		System.out.println("�޴��� ���� �ϼ��� 1)���2)��ȸ3)����Ʈ4)����5)������Ʈ6)�μ� ����7)����");
	}
	
	public void register() {
		System.out.println("����� �Է� �ϼ���.");
		int employeeId=sc.nextInt();sc.nextLine();
		System.out.println("�̸��� �Է� �ϼ���.");
		String firstName=sc.nextLine();
		System.out.println("���� �Է� �ϼ���.");
		String lastName=sc.nextLine();
		System.out.println("�޿��� �Է� �ϼ���.");
		int salary=sc.nextInt();sc.nextLine();
		System.out.println("�μ��� �Է� �ϼ���.");
		int department=sc.nextInt();sc.nextLine();
		Employee emp=new Employee(employeeId, firstName, lastName, salary,department);
		service.regiserEmp(emp, employees);
	}
	
	public void search() {
		System.out.println("��ȸ�� ����� �Է� �ϼ���.");
		int empId=sc.nextInt();sc.nextLine();
		service.searchEmp(empId, employees);
		
	}
	
	public void list() {
		System.out.println("��� ����Ʈ �Դϴ�.");
		service.empList(employees);
	}
	
	public void delete() {
		System.out.println("������ ����� �Է��ϼ���.");
		int empId=sc.nextInt();sc.nextLine();
		service.deleteEmp(empId, employees);
	}
	
	public void update() {
		System.out.println("������ ����� ����� �Է��ϼ���.");
		int empId=sc.nextInt();sc.nextLine();
		System.out.println("������ ����� �޿��� �Է��ϼ���.");
		int sal=sc.nextInt();sc.nextLine();
		Employee emp = service.returnEmp(empId, employees);
		emp .setSalary(sal);
		//service.
		
		
		
	}

}
