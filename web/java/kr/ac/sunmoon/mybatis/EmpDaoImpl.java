package kr.ac.sunmoon.mybatis;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

public class EmpDaoImpl implements EmpDao{
	
	public void insert(Map<String, String> parameter) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "mybatis", "mybatis$");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public Map<String, String> select(int no) {
		Map<String, String> map = new HashMap<String, String>();
		String sql = "SELECT EMPNO, ENAME FROM EMP WHERE EMPNO=" + no;
		Connection connection = null;
		Statement statement =null;
		ResultSet resultSet = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "mybatis", "mybatis$");
			statement = connection.prepareStatement(sql);
			
			resultSet = statement.executeQuery(sql);
			if(resultSet.next()) {
			String empNo = resultSet.getString("EMPNO");
			String eName = resultSet.getString("ENAME");
			
			map.put("EMPNO", empNo);
			map.put("ENAME", eName);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				connection.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return map;
	}

}
