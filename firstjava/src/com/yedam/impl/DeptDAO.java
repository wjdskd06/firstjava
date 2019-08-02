package com.yedam.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import com.yedam.Employee.common.DAO;

public class DeptDAO {
//	public Map<Integer, Integer> getMemberByDept(){
//		Connection conn = DAO.getConnect();
//		Map<Integer,Integer> map = new HashMap<Integer, Integer>();
//		String sql = "select d.department_name, e.department_id, count(*) as cnt\r\n" + 
//				"from employees e, departments d\r\n" + 
//				"where 1=1\r\n" + 
//				"and e.department_id = d.department_id\r\n" + 
//				"and e.department_id is not null\r\n" + 
//				"group by d.department_name, e.department_id";
//		try {
//			PreparedStatement pstmt = conn.prepareStatement(sql);
//			ResultSet res = pstmt.executeQuery();
//			while(res.next()) {
//				map.put(res.getInt("department_name"), res.getInt("count"));
//			}
//		} catch (SQLException e) {
//		
//			e.printStackTrace();
//		}
//		return map;
//	}
//}
	public Map<Integer, String> getDept() {
		Connection conn = DAO.getConnect();
		Map<Integer, String> map = new HashMap<Integer, String>();
		try {
			PreparedStatement pst = conn.prepareStatement("select DEPARTMENT_ID, DEPARTMENT_NAME from DEPARTMENTS");
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				map.put(rs.getInt("DEPARTMENT_ID"), rs.getString("DEPARTMENT_NAME"));
				
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
		return map;
	}
}
