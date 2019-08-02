package com.yedam.control;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.yedam.impl.DeptDAO;
import com.yedam.impl.EmpServiceImpl;
import com.yedam.model.EmpService;
import com.yedam.model.Employee;

public class EmpProc {
	EmpService service = new EmpServiceImpl();
	Scanner sc = new Scanner(System.in);

	public void execute() {
//		DeptDAO dao = new DeptDAO();
//		Map<Integer, String> map = dao.getDept();
//		Set<Integer> ketSet = map.keySet();
//		for(Integer intValue : ketSet) {
//			System.out.println("�μ���ȣ : " + intValue + ", �μ��� : " + map.get(intValue));
//		}
//		Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
//		for(Map.Entry<Integer, String> mapEntry : entrySet) {
//			System.out.println(mapEntry.getKey()+", "+ mapEntry.getValue());
//		}
//		Iterator<Map.Entry<Integer, String>> itr = entrySet.iterator();
//		Map<String, List<Employee>> mapEmp = new HashMap<>();

//		DeptDAO dao = new DeptDAO();
//		Map<Integer, String> map = dao.getDept();
//		Set<Integer> ketSet = map.keySet();
//		for(Integer intValue : ketSet) {
//			System.out.println("���� : " + intValue + ", ī��Ʈ : " + map.get(intValue));
//		}
//		Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
//		for(Map.Entry<Integer, String> mapEntry : entrySet) {
//			System.out.println(mapEntry.getKey()+", "+ mapEntry.getValue());
//		}
//		Iterator<Map.Entry<Integer, String>> itr = entrySet.iterator();
//		Map<String, List<Employee>> mapEmp = new HashMap<>();
//		

		System.out.println("1)����Ʈ 2)�ܰ�3)����4)����");
		int menu = sc.nextInt();sc.nextLine();
		if (menu == 1) {
			List<Employee> list = service.getEmpList();
			for (Employee emp : list) {
				System.out.println(emp.getFirstName());
			}
		} else if (menu == 2) {
			System.out.println("��ȸ�� ��� �Է�");
			int empId = sc.nextInt();
			Employee emp = service.getEmployee(empId);
			System.out.println(emp);
		}
			else if (menu == 3) {
				Employee emp = new Employee();
				System.out.println("�̸� �Է� : ");
				String fname = sc.nextLine();
				emp.setFirstName(fname);
				System.out.println(" �� �Է� : ");
				String lname = sc.nextLine();
				emp.setLastName(lname);
				System.out.println(" �޿� �Է� : ");
				int sal = sc.nextInt();sc.nextLine();
				emp.setSalary(sal);
				System.out.println("�� ���� �Է� : ");
				String email = sc.nextLine();
				emp.seteMail(email);
				System.out.println("�Ի��� �Է� : ");
				String hdate = sc.nextLine();
				emp.setHireDate(hdate);
				System.out.println("�μ���ȣ �Է� : ");
				int Id = sc.nextInt();sc.nextLine();
				emp.setJobId(Id);
				System.out.println("��� ��ȣ �Է� : ");
				int eId = sc.nextInt();
				emp.setEmployeeId(eId);
				
				System.out.println(emp);
				service.insertEmp(emp);
				System.out.println("�Է� �Ϸ� �Ǿ����ϴ�.");

				
			}
			else if(menu==4) {
				System.out.println("������ ID�� �Է� �ϼ���.");
				int empId = sc.nextInt();
				service.deleteEmp(empId);
				System.out.println("������ �Ϸ� �Ǿ����ϴ�.");
				
			}

		}
	}


