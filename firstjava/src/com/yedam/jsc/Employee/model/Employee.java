package com.yedam.jsc.Employee.model;

public class Employee {
	private int employeeId;
	private String firstName;
	private String lastName;
	private int salary;
	private int departmentId;
	
	public Employee(int employeeId, String firstName, String lastName, int salary, int dept) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		this.departmentId = dept;

	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "사원이름=" + employeeId +"\n 성=" + firstName + "\n 이름=" + lastName
				+ "\n 급여=" + salary + "";
	
	
	
	}

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

}
