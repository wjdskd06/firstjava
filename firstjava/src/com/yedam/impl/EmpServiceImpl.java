package com.yedam.impl;

import java.util.List;

import com.yedam.model.EmpService;
import com.yedam.model.Employee;

public class EmpServiceImpl implements EmpService {

	@Override
	public Employee getEmployee(int empId) {
	
		return null;
	}

	@Override
	public List<Employee> getEmpList() {
		EmpDAO dao = new EmpDAO();
		return null;
	}

	@Override
	public List<Employee> getEmpList(String hireDate) {
		
		return null;
	}

	@Override
	public void insertEmp(Employee emp) {
		

	}

	@Override
	public void updateEmp(int empId, int salary) {
	

	}

	@Override
	public void updateEmp(Employee emp) {
		

	}

	@Override
	public void deleteEmp(int empId) {
		

	}

}
