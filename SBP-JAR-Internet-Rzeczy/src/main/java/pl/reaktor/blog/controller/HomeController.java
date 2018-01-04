package pl.reaktor.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping(path = {"/", "/index"})
	public String index() {
		return "index";
	}
	
	@RequestMapping("/architektura")
	public String architektura() {
		return "architektura";
	}
	
	@RequestMapping("/chmura")
	public String chmura() {
		return "chmura";
	}
	
	@RequestMapping("/urzadzenia")
	public String urzadzenia() {
		return "urzadzenia";
	}
	
	@RequestMapping("/zastosowania")
	public String zastosowania() {
		return "zastosowania";
	}
}
