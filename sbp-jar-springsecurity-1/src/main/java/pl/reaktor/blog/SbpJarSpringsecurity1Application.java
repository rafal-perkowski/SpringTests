package pl.reaktor.blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import pl.reaktor.blog.controller.TestController;

@SpringBootApplication
public class SbpJarSpringsecurity1Application {

	public static void main(String[] args) {
		
		TestController.traceCounter(" IN: SbpJarSpringsecurity1Application main(" + args + ")");
		
		SpringApplication.run(SbpJarSpringsecurity1Application.class, args);
		
		TestController.traceCounter("OUT: SbpJarSpringsecurity1Application main(" + args + ")");
	}
}
