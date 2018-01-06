package pl.reaktor.blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import pl.reaktor.blog.controller.TestController;

@SpringBootApplication
public class SbpJarSpringsecurity3Application {

	public static void main(String[] args) {
		
		TestController.traceCounter(" IN: SbpJarSpringsecurity3Application main(" + args + ")");
		
		SpringApplication.run(SbpJarSpringsecurity3Application.class, args);
		
		TestController.traceCounter("OUT: SbpJarSpringsecurity3Application main(" + args + ")");
	}
}
