package kr.ac.sunmoon.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class InterceptorTester extends HandlerInterceptorAdapter{
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		HttpSession session = request.getSession();
		Object tester = session.getAttribute("loginInfo");
		if(tester != null) {
			return true;
		}else{
			response.sendRedirect("/login");
			return false;
		}
	}

}
