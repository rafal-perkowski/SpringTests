package pl.reaktor.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pl.reaktor.blog.model.Article;

@Controller
public class ArticleController {
	
	@PostMapping("/add")
	public String addArticle(@ModelAttribute Article formArticle, Model model) {
		
		TestController.traceCounter(" IN: ArticleController addArticle(" + formArticle + ", " + model + ")");
		
		if(checkNotEmpty(formArticle)) {
			
			model.addAttribute("formArticle", formArticle);
			
			TestController.traceCounter("OUT: ArticleController addArticle(" + formArticle + ", " + model + ")");
			
			return "success";
		} else {
			
			TestController.traceCounter("OUT: ArticleController addArticle(" + formArticle + ", " + model + ")");
			
			return "redirect:sorry";
		}
	}

	@GetMapping("/sorry")
	public String error() {
		
		TestController.traceCounter(" IN: ArticleController error()");
		TestController.traceCounter("OUT: ArticleController error()");
		
		return "error"; 
	}
	
	private boolean checkNotEmpty(Article article) {
		
		TestController.traceCounter(" IN: ArticleController checkNotEmpty(" + article + ")");
		
		boolean flagReturnBoolean = (article.getTitle()!=null && article.getTitle().length()>0) && (article.getContent()!=null && article.getContent().length()>0);
		
		TestController.traceCounter("OUT: ArticleController checkNotEmpty(" + article + ")");
		
		return flagReturnBoolean;
	} 
}
