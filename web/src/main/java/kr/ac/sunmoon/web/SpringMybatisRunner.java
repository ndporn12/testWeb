package kr.ac.sunmoon.web;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.GenericXmlApplicationContext;

public class SpringMybatisRunner {
	@Autowired
	private static SqlSession sqlSession;
	
	public static void main(String[] args) {
		
		
		try(GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:spring-application.xml")) {	
		DeptDao deptDao = ctx.getBean("deptDao" , DeptDao.class);
		
		Dept dept = new Dept();
		dept.setDeptNo(20);
		
		dept = deptDao.select(dept);
		
		System.out.println(dept.getdName());
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
