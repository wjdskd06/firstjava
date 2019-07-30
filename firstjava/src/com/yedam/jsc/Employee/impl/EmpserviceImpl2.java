package com.yedam.jsc.Employee.impl;

import java.util.Scanner;
import com.yedam.jsc.Employee.model.Employee;
import com.yedam.jsc.Employee.model.Empservice;

public class EmpserviceImpl2 implements Empservice {

	Scanner sc = new Scanner(System.in);

	@Override
	public void regiserEmp(Employee emp, Employee[] ary) {
		for (int i = 0; i < ary.length; i++) {
			if (ary[i] == null) {
				ary[i] = emp;
				break;
			}
		}

	}

	@Override
	public void searchEmp(int empId, Employee[] ary) {
		for (int i = 0; i < ary.length; i++) {
			if (ary[i] != null && ary[i].getEmployeeId() == empId) {
				System.out.println(ary[i]);

			}
		}

	}

	@Override
	public void empList(Employee[] ary) {
		System.out.println("====================================");
		System.out.println("사번\t 이름\t 성\t 급여\t 부서\t");
		System.out.println("====================================");
		for (int i = 0; i < ary.length; i++) {
			if (ary[i] != null) {
				System.out.print(ary[i].getEmployeeId() + "\t" + ary[i].getFirstName() + "\t" + ary[i].getLastName()
						+ "\t" + ary[i].getSalary() + "\t" + ary[i].getDepartmentId()+"\n");
			}

		}

	}

	@Override
	public void deleteEmp(int empId, Employee[] ary) {
		for (int i = 0; i < ary.length; i++) {
			if (ary[i] != null && ary[i].getEmployeeId() == empId) {
				ary[i] = null;
			}

		}

	}

	@Override
	public void updateEmp(int empId, Employee[] ary, int salary) {
		// TODO Auto-generated method stub

	}

	@Override
	public Employee returnEmp(int empId, Employee[] ary) {

		return null;
	}

}
