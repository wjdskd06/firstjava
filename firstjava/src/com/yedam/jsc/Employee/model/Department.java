package com.yedam.jsc.Employee.model;

public class Department {
	private int deaprtmentId;
	private String departmentName;
	public Department(int deptid, String departmentName){
		this.deaprtmentId = deptid;
		this.departmentName = departmentName;
		
	}
	public int getDeaprtmentId() {
		return deaprtmentId;
	}
	public void setDeaprtmentId(int deaprtmentId) {
		this.deaprtmentId = deaprtmentId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	@Override
	public String toString() {
		return "Department [deaprtmentId=" + deaprtmentId + ", departmentName=" + departmentName + "]";
	}
	
	

}
