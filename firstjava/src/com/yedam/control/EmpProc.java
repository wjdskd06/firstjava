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
//			System.out.println("부서번호 : " + intValue + ", 부서명 : " + map.get(intValue));
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
//			System.out.println("네임 : " + intValue + ", 카운트 : " + map.get(intValue));
//		}
//		Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
//		for(Map.Entry<Integer, String> mapEntry : entrySet) {
//			System.out.println(mapEntry.getKey()+", "+ mapEntry.getValue());
//		}
//		Iterator<Map.Entry<Integer, String>> itr = entrySet.iterator();
//		Map<String, List<Employee>> mapEmp = new HashMap<>();
//		

		System.out.println("1)리스트 2)단건3)삽입4)삭제");
		int menu = sc.nextInt();sc.nextLine();
		if (menu == 1) {
			List<Employee> list = service.getEmpList();
			for (Employee emp : list) {
				System.out.println(emp.getFirstName());
			}
		} else if (menu == 2) {
			System.out.println("조회할 사번 입력");
			int empId = sc.nextInt();
			Employee emp = service.getEmployee(empId);
			System.out.println(emp);
		}
			else if (menu == 3) {
				Employee emp = new Employee();
				System.out.println("이름 입력 : ");
				String fname = sc.nextLine();
				emp.setFirstName(fname);
				System.out.println(" 성 입력 : ");
				String lname = sc.nextLine();
				emp.setLastName(lname);
				System.out.println(" 급여 입력 : ");
				int sal = sc.nextInt();sc.nextLine();
				emp.setSalary(sal);
				System.out.println("이 메일 입력 : ");
				String email = sc.nextLine();
				emp.seteMail(email);
				System.out.println("입사일 입력 : ");
				String hdate = sc.nextLine();
				emp.setHireDate(hdate);
				System.out.println("부서번호 입력 : ");
				int Id = sc.nextInt();sc.nextLine();
				emp.setJobId(Id);
				System.out.println("사원 번호 입력 : ");
				int eId = sc.nextInt();
				emp.setEmployeeId(eId);
				
				System.out.println(emp);
				service.insertEmp(emp);
				System.out.println("입력 완료 되었습니다.");

				
			}
			else if(menu==4) {
				System.out.println("삭제할 ID를 입력 하세요.");
				int empId = sc.nextInt();
				service.deleteEmp(empId);
				System.out.println("삭제가 완료 되었습니다.");
				
			}

		}
	}


