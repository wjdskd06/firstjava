package com.yedam.jsc.Employee.common;

import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.yedam.jsc.MainClass;

public class DAO {

	static Connection conn;

	public static void getCon() throws ClassNotFoundException, SQLException {

		String user = "hr";
		String pw = "hr";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		Class.forName("oracle.jdbc.driver.OracleDriver");
		DriverManager.getConnection(url, user, pw);
		conn = DriverManager.getConnection(url, user, pw);

	}

	public static void updateEmp(Employee emp) throws ClassNotFoundException {
		try {
			getCon();
			String sql = "update emp_temp set salary = ? where employee_id = ?";

			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, emp.getEmployeeId());
//			pstmt.setString(2, emp.getLastName());
//			pstmt.setString(3, emp.getEmail());
//			pstmt.setString(4, emp.getHireDate());
//			pstmt.setString(5, emp.getJobId());
			pstmt.setInt(6, emp.salary);
			pstmt.executeQuery();
			int r = pstmt.executeUpdate();
			System.out.println(r + " 건이 입력 되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

//	public static void insertEmp(Employee emp) throws ClassNotFoundException {
//		try {
//			getCon();
//			String sql = "insert into emp_temp (EMPLOYEE_ID,  LAST_NAME, EMAIL, HIRE_DATE, JOB_ID, salary)"
//					+ " values(?,?,?,?,?,?)";
//
//			PreparedStatement pstmt = conn.prepareStatement(sql);
//			pstmt.setInt(1, emp.getEmployeeId());
//			pstmt.setString(2, emp.getLastName());
//			pstmt.setString(3, emp.getEmail());
//			pstmt.setString(4, emp.getHireDate());
//			pstmt.setString(5, emp.getJobId());
//			pstmt.setInt(6, emp.salary);
//			pstmt.executeUpdate();
//			pstmt.executeQuery();
//			int r = pstmt.executeUpdate();
//			System.out.println(r + " 건이 입력 되었습니다.");
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//
//	}

//	public static List<Departments> getDeptList() throws ClassNotFoundException, SQLException {
//		getCon();
//		List<Departments> list = new ArrayList<>();
//		String sql = "select * from departments";
//		Departments dept = null;
//		try {
//			PreparedStatement pstmt = conn.prepareCall(sql);
//			ResultSet rs = pstmt.executeQuery();
//			while (rs.next()) {
//				dept = new Departments();
//				dept.setDepartmentId(rs.getInt("department_Id"));
//				dept.setDepartmentName(rs.getString("Department_Name"));
//				dept.setLocationId(rs.getInt("Location_Id"));
//				dept.setManagerId(rs.getInt("Manager_Id"));
//				list.add(dept);
//				// System.out.println(rs.getString("first_name") + " " +
//				// rs.getString("last_name"));
//				// list.add(rs.getString("first_name"));
//
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				conn.close();
//
//			} catch (Exception e2) {
//				e2.printStackTrace();
//			}
//		}
//		return list;
//	}

	public static List<Employee> getEmpList() throws ClassNotFoundException, SQLException {
		getCon();
		List<Employee> list = new ArrayList<>();
		String sql = "select * from emp_temp";
		Employee emp = null;
		try {
			PreparedStatement pstmt = conn.prepareCall(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				emp = new Employee();
				emp.setEmployeeId(rs.getInt("employee_Id"));
				emp.setFristName(rs.getString("first_name"));
				emp.setLastName(rs.getString("last_name"));
				emp.setSalary(rs.getInt("salary"));
				list.add(emp);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();

			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return list;
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Employee emp = new Employee();
		emp.setEmployeeId(999);
		emp.setLastName("정승찬");
		emp.setEmail("a");
		emp.setJobId("a");
		emp.setHireDate("2010-05-01");
		emp.setSalary(1);
		updateEmp(emp);
		List<Employee> list = getEmpList();
		for (Employee str : list) {
			System.out.println("사번 = " + str.getEmployeeId() + ",이름" + str.getFristName() + ",성" + str.getLastName()
					+ ",급여" + str.getSalary());
		}
	}
}
