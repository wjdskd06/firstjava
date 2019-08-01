package com.yedam.jsc.Employee.model;

public interface Empservice {
	public void regiserEmp(Employee emp, Employee[] ary);
	public void searchEmp(int empId, Employee[] ary);
	public void empList(Employee[] ary);
	public void deleteEmp(int empId, Employee[] ary);
	public void updateEmp(int empId, Employee[] ary,int salary);
	public Employee returnEmp(int empId, Employee[] ary);
//	default void setDept(int empId, int deptId, Employee[] ary) {
//		for(int i=0; i<ary.length; i++) {
//			if(ary[i] != null && ary[i].getEmployeeId() == empId) {
//				ary[i].setDepartmentId(deptId);
//			}
//		}
//	}
//	
//	static void showDeptList(Department[] ary) {
//		for(int i=0; i<ary.length; i++) {
//			System.out.println(ary[i].toString());
//		}
//	}
	
}
