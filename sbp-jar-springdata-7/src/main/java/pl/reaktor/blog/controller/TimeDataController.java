package pl.reaktor.blog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import pl.reaktor.blog.data.TimeDataRepository;
import pl.reaktor.blog.model.TimeData;

@Controller
public class TimeDataController {
	
	private TimeDataRepository timeDataRepository;
	
	@Autowired
	public TimeDataController(TimeDataRepository timeDataRepository) {
		
		TestController.traceCounter(" IN: TimeDataController TimeDataController(" + timeDataRepository + ")");
		
		this.timeDataRepository = timeDataRepository;
		
		TestController.traceCounter("OUT: TimeDataController TimeDataController(" + timeDataRepository + ")");
	}

	@PostMapping("/save")
	public String saveTime(@ModelAttribute TimeData timeData) {
		
		TestController.traceCounter(" IN: TimeDataController saveTime(" + timeData + ")");
		
		timeDataRepository.save(timeData);
		
		TestController.traceCounter("OUT: TimeDataController saveTime(" + timeData + ")");
		
		return "redirect:/";
	}
	
	@GetMapping("/show")
	public String showAll(Model model) {
		
		TestController.traceCounter(" IN: TimeDataController showAll(" + model + ")");
			
		List<TimeData> allTimes = timeDataRepository.findAll();
		model.addAttribute("allTimes", allTimes);
		
		TestController.traceCounter("OUT: TimeDataController showAll(" + model + ")");
			
		return "showall";
	}
}