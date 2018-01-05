package pl.reaktor.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.reaktor.blog.model.Article;

@Controller
public class HomeController {
	
	@GetMapping("/")
	public String home(Model model) {
		
		TestController.traceCounter(" IN: HomeController home(" + model + ")");
		
		model.addAttribute("helloMessage", "Hello Thymeleaf!");
		//model.addAttribute("formArticle", new Article("Some title", "Content here...", "tag1, tag2, ..."));
		model.addAttribute("formArticle", new Article("", "", ""));
		
		TestController.traceCounter("OUT: HomeController home(" + model + ")");
		
		return "index";
	}
}
