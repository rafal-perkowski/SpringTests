package pl.reaktor.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GeneralController {
	
	@RequestMapping("/")
	public String home() {
		
		TestController.traceCounter(" IN: GeneralController home()");
		TestController.traceCounter("OUT: GeneralController home()");
		
		return "index";
	}
	
	@RequestMapping("/secret")
	public String secret() {
		
		TestController.traceCounter(" IN: GeneralController secret()");
		TestController.traceCounter("OUT: GeneralController secret()");
		
		return "secret";
	} 
}
