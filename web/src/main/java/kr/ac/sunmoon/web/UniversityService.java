package kr.ac.sunmoon.web;

import org.springframework.beans.factory.annotation.Autowired;

public class UniversityService {
	@Autowired
	private StudentDao studentDao;
	
	public UniversityService() {
		
	}

	public void monitor() {
		
		this.studentDao.selectAll();
	}
	
	/*
	 * @Autowired
	 * public void setStudentDao(StudentDao studentDao){
	 * this.studentDao=studentDao;
	 * }
	 */
}