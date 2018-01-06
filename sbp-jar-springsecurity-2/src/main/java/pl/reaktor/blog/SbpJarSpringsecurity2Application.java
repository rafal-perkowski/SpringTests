package pl.reaktor.blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import pl.reaktor.blog.controller.TestController;

@SpringBootApplication
public class SbpJarSpringsecurity2Application {

	public static void main(String[] args) {
		
		TestController.traceCounter(" IN: SbpJarSpringsecurity2Application main(" + args + ")");
		
		SpringApplication.run(SbpJarSpringsecurity2Application.class, args);
		
		TestController.traceCounter("OUT: SbpJarSpringsecurity2Application main(" + args + ")");
	}
}
