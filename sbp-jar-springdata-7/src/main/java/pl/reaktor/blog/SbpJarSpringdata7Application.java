package pl.reaktor.blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import pl.reaktor.blog.controller.TestController;

@SpringBootApplication
public class SbpJarSpringdata7Application {

	public static void main(String[] args) {
		
		TestController.traceCounter(" IN: SbpJarSpringdata7Application main(" + args + ")");
		
		SpringApplication.run(SbpJarSpringdata7Application.class, args);
		
		TestController.traceCounter("OUT: SbpJarSpringdata7Application main(" + args + ")");
	}
}
