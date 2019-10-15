package com.yedam.model;

import java.util.List;

import com.yedam.model.EmpService;
import com.yedam.model.Employee;

public class EmpServiceImpl implements EmpService {
	EmpDAO dao = new EmpDAO();

	@Override
	public Employee getEmployee(int empId) {
		Employee emp = dao.getEmployee(empId);
		return emp;
	}

	@Override
	public List<Employee> getEmpList() {
		return dao.getEmpList();
	}

	@Override
	public List<Employee> getEmpList(String hireDate) {

		return null;
	}

	@Override
	public void insertEmp(Employee emp) {
		
		dao.insertEmp(emp);
	}

	@Override
	public void updateEmp(int empId, int salary) {

	}

	@Override
	public void updateEmp(Employee emp) {

	}

	@Override
	public void deleteEmp(int empId) {
		dao.deleteEmp(empId);
	}

}
