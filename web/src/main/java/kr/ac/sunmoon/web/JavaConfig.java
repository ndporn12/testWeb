package kr.ac.sunmoon.web;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;

/*@EnableAspectJAutoProxy
@Configuration*/
public class JavaConfig {
	
	@Bean(initMethod = "starter", destroyMethod = "closer")
	public BeanTester tester() {
		return new BeanTester();
	}

	@Bean
	public UniversityService universityService() {
		return new UniversityService();
	}
	
	@Bean
	public StudentDao studentDao() {
		return new StudentDao();
	}
	
	@Bean
	public SecondService secondService() {
		return new SecondService();
	}
	
	@Bean
	public ExeTimeAspect exeTimeAspect() {
		return new ExeTimeAspect();
	}
	
	
}
