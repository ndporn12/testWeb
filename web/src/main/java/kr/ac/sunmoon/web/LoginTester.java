package kr.ac.sunmoon.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginTester {
	
	@RequestMapping("/login")
	public String loginPage() {
		return "/login";
	}
	
	@RequestMapping("/logout")
	public String logOut() {
		return "logout";
	}
}
