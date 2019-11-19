package kr.ac.sunmoon.web;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class EmpDao {
	String sql = "SELECT ENAME FROM EMP WHERE EMPNO=7934";
	
	private JdbcTemplate jdbcTemplate;
	
	public EmpDao(DataSource dataSource) {
		this.jdbcTemplate=new JdbcTemplate(dataSource);
	}
	
	public Map<String, String> select(){
		Map<String, String> rows = this.jdbcTemplate.queryForObject(
				sql,
				new RowMapper<Map<String,String>>(){
			@Override
			public Map<String, String> mapRow(ResultSet resultSet, int rowNum) throws SQLException {
				Map<String,String> row = new HashMap<String, String>();
				
				String ename = resultSet.getString("ENAME");
		
				row.put("ename",ename);
				return row;
			}
			
		});
		
		return rows;
	}
}
