package kr.ac.sunmoon.web;

import org.springframework.context.support.GenericXmlApplicationContext;


public class Application {
	
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx =
				new GenericXmlApplicationContext("classpath:applicationContext.xml");
		
		EmpDao empDao = ctx.getBean("empDao",EmpDao.class);
		
			System.out.println("==============================" + empDao.select().get("ename") + "==============================");
	
		ctx.close();
	}
	
	/*	xml 형식
	 * 
	 * GenericXmlApplicationContext ctx = new
	 * GenericXmlApplicationContext("classpath:applicationContext.xml");
	 */
	
	
	/* Annotation 형식
	 * 
	 * AnnotationConfigApplicationContext ctx = new
	 * AnnotationConfigApplicationContext(JavaConfig.class);
	 * 
	 * UniversityService us =
	 * ctx.getBean("universityService",UniversityService.class); us.monitor();
	 * 
	 * ctx.close();
	 */

}
