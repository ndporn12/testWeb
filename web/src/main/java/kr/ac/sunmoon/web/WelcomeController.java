package kr.ac.sunmoon.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WelcomeController {
	
	@RequestMapping("/tester")
	public String tester(@RequestParam(value="/tester", defaultValue="default 0000", required = false)String tester) {
		System.out.println("do tester.jsp as GET and Value is " + tester);
		return "/tester";
	}
	@RequestMapping("/rdTester")
	public String rdTester() {
		System.out.println("redirect to tester.jsp . . .");
		return "redirect:/tester";
	}
}
