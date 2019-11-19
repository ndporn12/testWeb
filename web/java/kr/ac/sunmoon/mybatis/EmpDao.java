package kr.ac.sunmoon.mybatis;

import java.util.Map;

public interface EmpDao {
	public void insert(Map<String,String>parameter);
	public Map<String, String> select(int no);
	
}
