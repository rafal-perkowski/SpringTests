package pl.reaktor.blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import pl.reaktor.blog.controller.TestController;

@SpringBootApplication
public class SbpJarSpringsecurity4Application {

	public static void main(String[] args) {
		
		TestController.traceCounter(" IN: SbpJarSpringsecurity4Application main(" + args + ")");
		
		SpringApplication.run(SbpJarSpringsecurity4Application.class, args);
		
		TestController.traceCounter("OUT: SbpJarSpringsecurity4Application main(" + args + ")");
	}
}
