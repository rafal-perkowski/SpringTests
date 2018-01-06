package pl.reaktor.blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import pl.reaktor.blog.controller.TestController;

@SpringBootApplication
public class SbpJarSpringsecurity5Application {

	public static void main(String[] args) {
		
		TestController.traceCounter(" IN: SbpJarSpringsecurity5Application main(" + args + ")");
		
		SpringApplication.run(SbpJarSpringsecurity5Application.class, args);
		
		TestController.traceCounter("OUT: SbpJarSpringsecurity5Application main(" + args + ")");
	}
}
