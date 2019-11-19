package kr.ac.sunmoon.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class TestInterceptor extends HandlerInterceptorAdapter{
	private static String allowedUri = "/loginpage";
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		HttpSession session = request.getSession();
		Object loginInfo = session.getAttribute("loginInfo");
		String requestUri = request.getRequestURI();
				
		if(loginInfo != null) {
			return true;
		}else if(requestUri.equals(allowedUri)){
			response.sendRedirect("/loginpage");
		}
		
		response.sendRedirect("/main");
		return false;
	}

}
/*
 * return super.preHandle(request, response, handler);
 */