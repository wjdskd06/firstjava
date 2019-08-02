package com.yedam.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.yedam.Employee.common.DAO;
import com.yedam.model.Employee;

public class EmpDAO {
	PreparedStatement pstmt = null;

	public Employee getEmployee(int empId) {
		Connection conn = DAO.getConnect();
		String sql = "select * from emp_temp where employee_id = ?";
		Employee emp = null;
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, empId);
			pstmt.executeQuery();
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				emp = new Employee();
				emp.setFirstName(rs.getString("first_name"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return emp;
	}

	public List<Employee> getEmpList() {
		Connection conn = DAO.getConnect();
		String sql = "select * from emp_temp order by 1";
		Employee emp = null;
		List<Employee> list = new ArrayList<Employee>();
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				emp = new Employee();
				emp.setFirstName(rs.getString("first_name"));
				list.add(emp);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;

	}

	public void insertEmp(Employee emp) {
		System.out.println(emp);
		Connection conn = DAO.getConnect();
		String sql = "insert into emp_temp (first_Name, last_Name, eMail, job_Id, hire_Date, Salary,employee_id)"
				+ " values(?,?,?,?,?,?,?)";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, emp.getFirstName());
			pstmt.setString(2, emp.getLastName());
			pstmt.setString(3, emp.geteMail());
			pstmt.setInt(4, emp.getJobId());
			pstmt.setString(5, emp.getHireDate());
			pstmt.setInt(6, emp.getSalary());
			pstmt.setInt(7, emp.getEmployeeId());
			int r = pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void deleteEmp(int empId) {
		Connection conn = DAO.getConnect();
		String sql = "delete from emp_temp where employee_id = ?";

		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, empId);
			int r = pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
