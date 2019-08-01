package com.yedam.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.yedam.Employee.common.DAO;
import com.yedam.model.Employee;

public class EmpDAO {
	public List<Employee> gerEmpList(){
		Connection conn = DAO.getConnect();
		String sql = "select * from emp_temp order by 1";
		try{
			PreparedStatment pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.excuteQuery();
			while(rs.next()) {
				emp = new Employee();
				emp.setFirstname(rs.getString("first_name"));
				list.add(emp);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		
	}
	

}
