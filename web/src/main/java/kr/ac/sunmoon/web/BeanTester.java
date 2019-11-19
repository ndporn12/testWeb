package kr.ac.sunmoon.web;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanTester{

	public void starter() {
		System.out.println("start");
	}
	
	public void closer() {
		System.out.println("closing");
	}

	
}
