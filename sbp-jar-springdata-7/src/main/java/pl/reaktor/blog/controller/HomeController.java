package pl.reaktor.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import pl.reaktor.blog.model.TimeData;

@Controller
public class HomeController {
	
	@GetMapping
	public String home(Model model) {
		
		TestController.traceCounter(" IN: HomeController home(" + model + ")");
		
		model.addAttribute("timeData", new TimeData());
		
		TestController.traceCounter("OUT: HomeController home(" + model + ")");
		
		return "index";
	}
}
