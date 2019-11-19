package kr.ac.sunmoon.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PvTester {
	
	@RequestMapping("/pvtester/{no}")
	public String pvTester(@PathVariable int no) {
		
		System.out.println(no);
		
		return "/pvtester";
	}
}
