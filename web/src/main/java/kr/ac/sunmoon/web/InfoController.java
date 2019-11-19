package kr.ac.sunmoon.web;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class InfoController {
	
	@RequestMapping("/info")
	public String tester() {
		return "/info";
	}
	@RequestMapping
	public ModelAndView printer(String url) {
		
		return new ModelAndView(new RedirectView(url));
		
	}
}
