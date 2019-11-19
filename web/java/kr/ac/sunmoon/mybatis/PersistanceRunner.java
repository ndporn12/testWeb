package kr.ac.sunmoon.mybatis;

import java.util.Map;

public class PersistanceRunner {
	public static void main(String[] args) {
		EmpDao empDao = new EmpDaoImpl();
		Map<String,String> map = empDao.select(7369);
		System.out.println(map);
		
	}
}
