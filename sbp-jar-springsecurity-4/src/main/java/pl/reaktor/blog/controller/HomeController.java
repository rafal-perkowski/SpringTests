package pl.reaktor.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping("/loginform")
	public String loginForm() {
		
		TestController.traceCounter(" IN: HomeController loginForm()");
		TestController.traceCounter("OUT: HomeController loginForm()");
		
		return "login_form";
	}
}